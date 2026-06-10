package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ServicioNotificacionSMS implements IListener1{

    @Override
    public void actualizar(String msg) {
        System.out.println("Enviando SMS al celular del cliente: " + msg);
    }
    
}
