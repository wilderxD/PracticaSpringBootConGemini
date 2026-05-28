package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ObserverImplementacion {

    public static void main(String[] args) {
        
        TiendaForli tienda = new TiendaForli();        
        IObservador email = new ModuloEmail();        
        IObservador logistica = new ModuloLogistica();
        
        tienda.suscribir(email);
        tienda.suscribir(logistica);
        
        tienda.lanzarNuevaPromocion("¡2X1 en todod Almohadas..");
    }
    
}
