package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ConsolaLogger implements IListener{

    @Override
    public void onEvent(EventoSistema evento) {
        System.out.println("Se genero un evento de tipo: " + evento.getInfo() + " : " + evento.getDescripcion());
    }
    
}
