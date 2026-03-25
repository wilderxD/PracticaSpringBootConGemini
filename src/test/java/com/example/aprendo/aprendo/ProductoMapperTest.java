package com.example.aprendo.aprendo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;


public class ProductoMapperTest {
    
    private final ProductoMapper mapper = new ProductoMapper();
    
    @Test
    void toDTO_DeberiaConvertirEntidadADTO(){
        Producto entidad = new Producto();
        entidad.setId(1L);
        entidad.setNombre("Monitor");
        entidad.setPrecio(150.0);
        
        ProductoDTO dto = mapper.toDTO(entidad);
        
        assertEquals(entidad.getId(), dto.getId());
        assertEquals(entidad.getNombre(), dto.getNombre());
        assertEquals(entidad.getPrecio(), dto.getPrecio());
        
    }
    
    @Test
    void toEntity_DeberiaConvertirDTOAEntidad(){
        
        ProductoDTO dto = new ProductoDTO();
        dto.setId(1L);
        dto.setNombre("Mouse");
        dto.setPrecio(15.00);
        
        Producto entidad = mapper.toEntity(dto);
        
        assertEquals(dto.getId(), entidad.getId());
        assertEquals(dto.getNombre(), entidad.getNombre());
        assertEquals(dto.getPrecio(), entidad.getPrecio());        
    }
    
    @Test
    void toEntity_DebeManejarNulo(){
        ProductoDTO dtoNulo = null;
        
        assertThrows(NullPointerException.class, () -> mapper.toEntity(dtoNulo));
        
    }
    
    
}
