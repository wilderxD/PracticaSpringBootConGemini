package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class Camion implements ITransporte{

    @Override
    public void entregar() {
        System.out.println("Entregado por carretera");
    }
    
}
