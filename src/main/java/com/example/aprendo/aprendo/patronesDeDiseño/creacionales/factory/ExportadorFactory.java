package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class ExportadorFactory {
    
    public static IExportador crearExportador(FormatoExportacion formato){
        switch(formato){
            case PDF: 
                return new ExportadorPDF();
            case EXCEL: 
                return new ExportadorExcel();
            default: throw new IllegalArgumentException("Opcion no definida.!");
        }
    }
}
