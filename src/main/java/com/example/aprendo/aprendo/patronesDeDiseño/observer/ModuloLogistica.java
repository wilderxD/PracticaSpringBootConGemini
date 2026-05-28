package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ModuloLogistica implements IObservador{

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Logistica preparada para despachar la promo: " + mensaje);
    }
    
}
