package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class ExportadorPDF implements IExportador{

    @Override
    public void exportar(String contenido) {
        System.out.println("Guradado en PDF" + contenido);
    }
    
}
