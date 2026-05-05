package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class ExportadorExcel implements IExportador{

    @Override
    public void exportar(String contenido) {
        System.out.println("Guardado en celdas " + contenido);
    }
    
}
