package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorFirmaDigital extends ReporteDecorator{
    
    public DecoradorFirmaDigital(IReporte reporte) {
        super(reporte);
    }

    @Override
    public String generar() {
        return super.generar() + "\n-- Firmado por Sistema Forli";
    }
    
}
