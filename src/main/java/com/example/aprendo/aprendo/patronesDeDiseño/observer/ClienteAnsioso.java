package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ClienteAnsioso implements IObservadorTienda{
    private TiendaForli1 tienda;

    public ClienteAnsioso(TiendaForli1 tienda) {
        this.tienda = tienda;
    }

    @Override
    public void actualizar(TiendaForli1 tienda) {
        if(tienda.getStock() > 0){
            System.out.println("¡Por fin! Comprando colchón...");
            tienda.desuscribir(this);
        }
    }
    
}
