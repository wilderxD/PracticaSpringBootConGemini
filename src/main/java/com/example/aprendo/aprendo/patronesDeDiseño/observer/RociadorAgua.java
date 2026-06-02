package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class RociadorAgua implements IObservador{

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Rociador activado por alerta: " + mensaje);
    }
    
}
