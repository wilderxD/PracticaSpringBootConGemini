package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorEmail extends NotificadorDecorator{
    
    public DecoradorEmail(INotificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando Email: " + mensaje);
    }
    
}
