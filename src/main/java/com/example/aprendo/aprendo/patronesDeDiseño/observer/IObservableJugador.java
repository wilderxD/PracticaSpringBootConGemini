package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public interface IObservableJugador {
    public void suscribir(IJugador j);
    public void desuscribir(IJugador i);
    public void notificarTodos();
}
