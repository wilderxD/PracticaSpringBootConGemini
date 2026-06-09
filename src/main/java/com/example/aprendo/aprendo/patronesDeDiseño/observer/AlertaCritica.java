package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class AlertaCritica implements IListener{

    @Override
    public void onEvent(EventoSistema evento) {
     
        if(evento.getInfo().equals("ERROR")){
            System.out.println("Se genero un evento de tipo: " + evento.getInfo() + " : " + evento.getDescripcion());
        }
    }
    
}
