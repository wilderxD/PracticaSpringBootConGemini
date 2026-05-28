package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ModuloEmail implements IObservador{

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Email enviado al cliente con la promo: " + mensaje);
    }
    
}
