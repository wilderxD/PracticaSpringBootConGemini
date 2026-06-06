package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public interface IObservableBolsa {
    public void suscribir(IInversor i);
    public void desuscribir(IInversor i);
    public void notificarTodos();
}
