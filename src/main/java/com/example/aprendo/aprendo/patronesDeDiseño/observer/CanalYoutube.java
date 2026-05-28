package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class CanalYoutube implements IObservable{
    private String nombreCanal;
    private List<IObservador> suscriptores= new ArrayList<>();
    
    public void subirVideo(String titulo){
        System.out.println("El canal " + nombreCanal + " subio un nuevo video.");
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
            obs.actualizar(this.nombreCanal);
        }
    }
}
