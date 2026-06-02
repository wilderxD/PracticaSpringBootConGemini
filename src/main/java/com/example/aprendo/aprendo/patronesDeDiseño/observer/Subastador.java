package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class Subastador implements IObservable{

    private List<IObservador> suscriptores = new ArrayList<>();
    private String nOferta;
    
    public void aceptarNuevaOferta(double monto){
        this.nOferta = "Nueva oferta máxima de $" + monto;
        notificarTodos();
    }
    
    @Override
    public void suscribir(IObservador o) {
        suscriptores.add(o);
    }

    @Override
    public void desuscribir(IObservador o) {
        suscriptores.remove(o);
    }

    @Override
    public void notificarTodos() {
        for(IObservador obs : suscriptores){
            obs.actualizar(this.nOferta);
        }
    }
    
}
