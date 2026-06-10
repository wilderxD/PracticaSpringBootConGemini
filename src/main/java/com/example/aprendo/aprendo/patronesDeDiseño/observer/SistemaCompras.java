package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class SistemaCompras {

    private EventManager e;
    
    public SistemaCompras(EventManager e) {
        this.e = e;
    }
    
    public void realizarCompra(){
        e.notificarEmail("Factura adjunta");
        e.notificarSMS("Cargo a su tarjeta");
    }
    
}
