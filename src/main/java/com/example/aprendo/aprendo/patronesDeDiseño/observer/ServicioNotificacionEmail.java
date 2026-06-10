package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ServicioNotificacionEmail implements IListener1{

    @Override
    public void actualizar(String msg) {
        System.out.println("Enviando EMAIL al cliente: " + msg);
    }
    
}
