package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class ReporteDecorator implements IReporte{
    private IReporte reporte;
    
    public ReporteDecorator(IReporte reporte){
        this.reporte = reporte;
    }

    @Override
    public String generar(){
        return this.reporte.generar();
    }
    
}
