package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements IObservableJugador{
    
    private String stadoJuego;
    private List<IJugador> jugadores = new ArrayList<>();

    public Servidor(String stadoJuego) {
        this.stadoJuego = stadoJuego;
    }

    public String getStadoJuego() {
        return stadoJuego;
    }
    
    public void cambiarEstado(String estado){
        this.stadoJuego = estado;
        notificarTodos();
    }

    @Override
    public void suscribir(IJugador j) {
        jugadores.add(j);
    }

    @Override
    public void desuscribir(IJugador i) {
        jugadores.remove(i);
    }

    @Override
    public void notificarTodos() {
        for(IJugador i : jugadores){
            i.actualizar(this);
        }
    }
    
}
