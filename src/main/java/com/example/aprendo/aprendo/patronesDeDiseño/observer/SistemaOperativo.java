package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaOperativo implements IObservableOS{
    
    public List<IListener> suscriptores = new ArrayList<>();
    
    public void generarFallo(){
        EventoSistema e = new EventoSistema("ERROR", "ocurrio un fallor en el arranque.!");
        notificarTodos(e);
    }
    
    public void iniciarPrograma(){
        EventoSistema e = new EventoSistema("INFO", "");
        notificarTodos(e);
    }

    @Override
    public void suscribir(IListener i) {
        suscriptores.add(i);
    }

    @Override
    public void desuscribir(IListener i) {
        suscriptores.remove(i);
    }

    @Override
    public void notificarTodos(EventoSistema e) {
        for(IListener i : suscriptores){
            i.onEvent(e);
        }
    }
    
}
