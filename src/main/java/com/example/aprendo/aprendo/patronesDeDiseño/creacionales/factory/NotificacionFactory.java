package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;


public class NotificacionFactory {
    
    public static INotificacion crearNotificacion(CanalNotificacion canal){
        switch(canal){
            case EMAIL: 
                return new NotificacionEmail();
            case SMS: 
                return new NotificacionSMS();
            default:
                throw new IllegalArgumentException("La notificacion solicitafa");
        }
    }
}
