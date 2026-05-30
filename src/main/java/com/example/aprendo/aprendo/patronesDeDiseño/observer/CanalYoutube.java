package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class CanalYoutube implements IObservable{
    private String nombreCanal;
    private List<IObservador> suscriptores= new ArrayList<>();

    public CanalYoutube(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }
    
    
    public void subirVideo(String titulo){
        notificarTodos();
        System.out.println("El canal " + nombreCanal + " subio un nuevo video.");        
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
            obs.actualizar(""); 
        }
    }
}
