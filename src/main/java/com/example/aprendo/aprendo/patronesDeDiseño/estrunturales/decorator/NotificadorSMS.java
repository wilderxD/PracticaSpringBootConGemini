package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class NotificadorSMS implements INotificador{

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
    
}
