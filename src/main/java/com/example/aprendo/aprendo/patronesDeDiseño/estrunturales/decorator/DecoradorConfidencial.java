package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorConfidencial extends ReporteDecorator{
    
    public DecoradorConfidencial(IReporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return "CONFIDENCIAL: \n" + super.generar();
    }
    
}
