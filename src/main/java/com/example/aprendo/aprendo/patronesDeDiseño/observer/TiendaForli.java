package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class TiendaForli implements IObservable{
    
    private List<IObservador> suscriptores = new ArrayList<>();
    private String ultimaNoticia;

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
        for(IObservador sub : suscriptores){
            sub.actualizar(this.ultimaNoticia);
        }
    }
    
    public void lanzarNuevaPromocion(String promo){
        this.ultimaNoticia = promo;
        System.out.println("Tienda: Preparando promocion.... ¡Lanzando!");
        notificarTodos();
    }
}
