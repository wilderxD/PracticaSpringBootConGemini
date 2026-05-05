package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class NotificacionSMS implements INotificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificando delde SMS " + mensaje);
    }
    
}
