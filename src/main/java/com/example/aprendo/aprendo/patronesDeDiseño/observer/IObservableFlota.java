package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public interface IObservableFlota {
    public void suscribir(IObservadorFlota o);
    public void desuscribir(IObservadorFlota o);
    public void notificarTodos();
}
