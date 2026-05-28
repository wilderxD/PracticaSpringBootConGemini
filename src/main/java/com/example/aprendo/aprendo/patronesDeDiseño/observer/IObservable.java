package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public interface IObservable {
    public void suscribir(IObservador o);
    public void desuscribir(IObservador o);
    public void notificarTodos();
}
