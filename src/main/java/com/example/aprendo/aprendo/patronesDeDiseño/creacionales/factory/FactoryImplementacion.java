package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class FactoryImplementacion {

    public static void main(String[] args) {
        //Ejercicio 1
        TipoTransporte tipo = TipoTransporte.MARITIMO;
        ITransporte miTransporte = TransporteFactory.crearTransporte(tipo);
        miTransporte.entregar();
        
        //Ejercicio 2
        FormatoExportacion fExportacion = FormatoExportacion.EXCEL;
        IExportador miExportacion = ExportadorFactory.crearExportador(fExportacion);
        miExportacion.exportar("todo va ah estar bien");
        
        //Ejercicio 3
        CanalNotificacion notificacion = CanalNotificacion.EMAIL;
        INotificacion miNotificacion = NotificacionFactory.crearNotificacion(notificacion);
        miNotificacion.enviar("Esto es urgente, responde!");
        
        //Ejercicio 4
        
        
    }
    
}
