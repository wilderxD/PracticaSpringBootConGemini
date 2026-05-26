package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class ReporteInventario implements IReporte{

    @Override
    public String generar() {
        return "Datos de inventario actualizados.!";
    }
    
}
