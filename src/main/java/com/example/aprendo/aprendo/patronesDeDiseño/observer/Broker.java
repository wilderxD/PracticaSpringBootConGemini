package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class Broker implements IInversor{
    
    private String nombre;

    public Broker(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public void actualizar(Accion accion) {
        System.out.println("Broker: " + this.nombre + " alerta: La accion " + accion.getSimbolo() + " acaba de cambiar a $" + accion.getPrecio());
    }
    
}
