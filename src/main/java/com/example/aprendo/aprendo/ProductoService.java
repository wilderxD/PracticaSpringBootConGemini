package com.example.aprendo.aprendo;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    
    private final ProductoRepository repositorio;

    public ProductoService(ProductoRepository repositorio) {
        this.repositorio = repositorio;
    }
    
    public List<Producto> obtenerTodos(){
        return repositorio.findAll();
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
    
}
