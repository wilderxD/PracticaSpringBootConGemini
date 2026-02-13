package com.example.aprendo.aprendo;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {        
    
    private final ProductoService servicio;
    private final ProductoMapper productoMapper;
    
            
    public ProductoController(ProductoService servicio, ProductoMapper productoMapper) {
        this.servicio = servicio;
        this.productoMapper = productoMapper;
    }
    
    @GetMapping
    public List<ProductoDTO> obtenerTodos(){
        List<Producto> listaProductos =  servicio.obtenerTodos();
        
        return listaProductos.stream()
                .map(producto -> productoMapper.toDTO(producto))
                .toList();
    }
    
    @PostMapping
    public ResponseEntity<ProductoDTO> guardar(@Valid @RequestBody ProductoDTO productoDTO){
                
        Producto producto = productoMapper.toEntity(productoDTO);        
       
            Producto guardado = servicio.guardar(producto);
            ProductoDTO dto = productoMapper.toDTO(guardado);
            return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
    
    @GetMapping("/{id}")
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
    public ResponseEntity<ProductoDTO> actualizar(@Valid @RequestBody ProductoDTO productoDTO, @PathVariable Long id){
        Producto productoEditado = productoMapper.toEntity(productoDTO);
        
        Producto productoActualizado = servicio.actualizar(id, productoEditado);
                
        return ResponseEntity.ok(productoMapper.toDTO(productoActualizado));
    }    
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
    
}
