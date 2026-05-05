package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class NotificacionEmail implements INotificacion{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Notificando mediante Email: " + mensaje);
    }
    
}
