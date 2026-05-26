package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class NotificadorDecorator implements INotificador{
    
    protected INotificador notificador;
    
    public NotificadorDecorator(INotificador notificador){
        this.notificador = notificador;
    }

    @Override
    public void enviar(String mensaje) {
        notificador.enviar(mensaje);
    }
    
}
