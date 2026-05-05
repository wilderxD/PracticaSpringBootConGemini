package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class Barco implements ITransporte{

    @Override
    public void entregar() {
        System.out.println("Enregado por mar");
    }
    
}
