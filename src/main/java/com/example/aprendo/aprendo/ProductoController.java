package com.example.aprendo.aprendo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
@Tag(name = "Productos", description = "EndPoints para la gestion del inventario de producto")
public class ProductoController {        
    
    private final ProductoService servicio;
    private final ProductoMapper productoMapper;
    
            
    public ProductoController(ProductoService servicio, ProductoMapper productoMapper) {
        this.servicio = servicio;
        this.productoMapper = productoMapper;
    }
    
    @GetMapping
    @Operation(summary = "Listar todos los productos", description = "Devuelve una lista completa con todos los productos disponibles en la base de datos")
    public List<ProductoDTO> obtenerTodos(){
        List<Producto> listaProductos =  servicio.obtenerTodos();
        
        return listaProductos.stream()
                .map(producto -> productoMapper.toDTO(producto))
                .toList();
    }
    
    @GetMapping("/paginado")
    public ResponseEntity<Page<ProductoDTO>> listarPaginado(
            @RequestParam(defaultValue = "0") int page, 
            @RequestParam(defaultValue = "10") int size, 
            @RequestParam(defaultValue = "nombre,asc") String sort){
        //Convertimos los strings en un objeto Pageable
        //El formato de sort es "campo, direccion" (ej: "precio, desc")
        String[] sortParams = sort.split(",");
        Sort orden = sortParams[1].equalsIgnoreCase("asc") ? Sort.by(sortParams[0]).ascending() : Sort.by(sortParams[0]).descending();
        
        Pageable pageable = PageRequest.of(page, size, orden);
        
        return ResponseEntity.ok(servicio.obtenerTodosPaginados(pageable));
    }
    
    @PostMapping
    @Operation(summary = "Crear un producto", description = "Guarda un nuevo producto en el sistema. Requiere validacion de nombre y precio.")
    public ResponseEntity<ProductoDTO> guardar(@Valid @RequestBody ProductoDTO productoDTO){
                
        Producto producto = productoMapper.toEntity(productoDTO);        
       
            Producto guardado = servicio.guardar(producto);
            ProductoDTO dto = productoMapper.toDTO(guardado);
            return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
    
    @GetMapping("/{id}")
    @Operation(summary = "Lista un producto", description = "Lista un producto de la base de datos usando su ID, requiere que se le mande u numero de ID ")
    public ResponseEntity<ProductoDTO> obtenerUno(@PathVariable Long id){
        /*Optional<Producto> produc = servicio.obtenerPorId(id);        
        
        if(produc.isPresent()){      
            ProductoDTO dto = productoMapper.toDTO(produc.get());
            return ResponseEntity.ok(dto);
        }else{
            return ResponseEntity.notFound().build();
        }       */
        //Lo de arriba es lo mismo que lo de abajo solo que mas profesional esto funciona siempre y cuando sea de tipo optional
       /* return servicio.obtenerPorId(id)
                .map(producto -> productoMapper.toDTO(producto))
                .map(dto -> ResponseEntity.ok(dto))
                .build(); */
       Producto prod = servicio.obtenerPorId(id);
       return ResponseEntity.ok(productoMapper.toDTO(prod));
    } 
    
    @PutMapping("/{id}")
    @Operation(summary = "Actualiza datos", description = "Actualiza los datos de un producto usadno su ID para la busqueda. Requiere el ID del producto a actualizar y valida nombre y precio")
    public ResponseEntity<ProductoDTO> actualizar(@Valid @RequestBody ProductoDTO productoDTO, @PathVariable Long id){
        Producto productoEditado = productoMapper.toEntity(productoDTO);
        
        Producto productoActualizado = servicio.actualizar(id, productoEditado);
                
        return ResponseEntity.ok(productoMapper.toDTO(productoActualizado));
    }    
    
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')") // EL CANDADO
    @Operation(summary = "Elimina un producto", description = "Borra un producto de la base de datos. Requiere un ID de tipo Long")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
    
}
