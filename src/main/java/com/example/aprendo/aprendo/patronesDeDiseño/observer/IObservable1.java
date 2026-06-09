package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public interface IObservable1 {
    public void suscribir(IObservadorTienda t);
    public void desuscribir(IObservadorTienda t);
    public void notificarTodos();
}
