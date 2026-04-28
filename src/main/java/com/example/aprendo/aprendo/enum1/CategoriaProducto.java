package com.example.aprendo.aprendo.enum1;

public enum CategoriaProducto {
    
    ELECTRO(0.5),
    MUEBLES(0),
    ROPA(0.20);
    
    private double porcentajeDescuento;
    
    private CategoriaProducto(double porcentajeDescuento){
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
}
