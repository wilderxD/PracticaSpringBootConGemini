package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class Accion implements IObservable{
    
    private String simbolo;
    private double precio;
    private List<IObservador> suscriptores = new ArrayList<>();

    @Override
    public void suscribir(IObservador o) {
        
    }

    @Override
    public void desuscribir(IObservador o) {
        
    }

    @Override
    public void notificarTodos() {
        
    }
    
}
