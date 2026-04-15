package com.example.aprendo.aprendo;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    private final ProductoRepository repositorio;
    private final ProductoMapper productoMapper;

    public ProductoService(ProductoRepository repositorio, ProductoMapper productoMapper) {
        this.repositorio = repositorio;
        this.productoMapper = productoMapper;
    }
    
    public List<Producto> obtenerTodos(){
        return repositorio.findAll();
    }
    
    public Page<ProductoDTO> obtenerTodosPaginados(Pageable pageable){
        //Buscamos en la base de datos usando el Pageable
        Page<Producto> paginasProductos = repositorio.findAll(pageable);
        
        //convertimos la pagina de entidades a DTOs
        return paginasProductos.map(producto -> productoMapper.toDTO(producto));       
        
    }
    
    public Producto guardar(Producto p){
        return repositorio.save(p);
    }
    
    public Producto obtenerPorId(Long id){
        //busco el producto si no lo encuentra lansa la excepcion personalizada
        return repositorio.findById(id)
                .orElseThrow(() -> new RecursoNoEncontradoException("Producto no encontrado con ID: " + id));
    }
    
    @Transactional
    public Producto actualizar(Long id, Producto pEditado){
        Producto producto = obtenerPorId(id);
        
        producto.setNombre(pEditado.getNombre());
        producto.setPrecio(pEditado.getPrecio());
        
        return repositorio.save(producto);
    }
    
    public void eliminar(Long id){
        repositorio.deleteById(id);
    }
    
    // ENDPONTS DE PRUEBA
    int numeroDePagina = 0;
    int tamanoDePagina = 5;
    
    public Page<Producto> obtenerPaginadode5(Pageable ordenPaginacion){
    Pageable miOrden = PageRequest.of(numeroDePagina, tamanoDePagina);
    
    return repositorio.findAll(miOrden);   
    }
    
    //Solicitar la tercera página con tamaño de 10. (Recuerda cómo empezamos a contar).
    public Page<Producto> obtenerLaTerceraPagina(Pageable orden){
        return repositorio.findAll(orden);
    }
    
    //Solicitar la página 0, tamaño 20, ordenando por 'precio' de forma ascendente.
    public Page<Producto> ObtenerPaginadode20Ordenado(Pageable orden){
                
        return repositorio.findAll(orden);
    }
    
    //Solicitar la página 0, tamaño 10, ordenando por 'nombre' de forma descendente.
    public Page<Producto> obtenerPaginadoDe10Ordenado(Pageable orden){
        return repositorio.findAll(orden);
    }
    
    //
    
    
}
