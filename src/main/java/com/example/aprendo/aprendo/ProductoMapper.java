package com.example.aprendo.aprendo;

import org.springframework.stereotype.Component;

@Component //Par aque nos permita injectarla
public class ProductoMapper {
    
    public Producto toEntity(ProductoDTO dto){
        Producto producto = new Producto();        
        producto.setId(dto.getId());
        producto.setNombre(dto.getNombre());
        producto.setPrecio(dto.getPrecio());
        
        return producto;
    }
    
    public ProductoDTO toDTO(Producto entity){
        ProductoDTO dto = new ProductoDTO();
        dto.setId(entity.getId());
        dto.setNombre(entity.getNombre());
        dto.setPrecio(entity.getPrecio());
        
        return dto;
    }
    
    
}
