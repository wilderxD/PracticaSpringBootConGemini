package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class CarritoCompras {
    private IMetodoPago mp;
    
    public void setMp(IMetodoPago mp){
        this.mp = mp;
    }
    
    public void pagarTiket(double monto){
        if(this.mp == null){
            throw new IllegalStateException("!No as Seleccionado ni una estrategia.!");
        }        
        mp.procesarPago(monto);
    }
}
