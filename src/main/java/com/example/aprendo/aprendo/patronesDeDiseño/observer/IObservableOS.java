package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public interface IObservableOS {
    public void suscribir(IListener i);
    public void desuscribir(IListener i);
    public void notificarTodos(EventoSistema e);
}
