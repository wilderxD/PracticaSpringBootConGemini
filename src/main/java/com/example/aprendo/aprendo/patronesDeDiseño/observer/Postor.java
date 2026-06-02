package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class Postor implements IObservador{
    
    private String nombre;

    public Postor(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void actualizar(String mensaje) {
        System.out.println(this.nombre + " evalúa si subir la oferta de " + mensaje);
    }
    
}
