package com.example.aprendo.aprendo;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class ProductoDTO {
    
    @Schema(description = "ID autogenerado del producto", example = "1")
    private Long id;
        
    @NotBlank(message = "El campo no puede estar en blanco.!")
    @Schema(description = "Nombre comercial del producto", example = "Laptop Gamer ASUS")
    private String nombre;
    
    @Min(value = 0, message = "El valor no puede ser negativo")
    @Schema(description = "Precio de venta al publico", example = "3500.00")
    private Double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
        
    public ProductoDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    
    
}
