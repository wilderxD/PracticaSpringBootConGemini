package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorWhatsApp extends NotificadorDecorator{
    
    public DecoradorWhatsApp(INotificador notificador) {
        super(notificador);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
    
    
    
}
