package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class Accion implements IObservableBolsa{
    
    private String simbolo;
    private double precio;
    private List<IInversor> suscriptores = new ArrayList<>();

    public Accion(String simbolo, double precio) {
        this.simbolo = simbolo;
        this.precio = precio;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double nuevoPrecio){
        this.precio = precio;
        notificarTodos();
    }
    
    @Override
    public void suscribir(IInversor i) {
        suscriptores.add(i);
    }

    @Override
    public void desuscribir(IInversor i) {
        suscriptores.remove(i);
    }

    @Override
    public void notificarTodos() {
        for(IInversor i : suscriptores){
            i.actualizar(this);
        }
    }

    
    
}
