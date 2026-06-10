package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<IListener1> canalesEmail = new ArrayList<>();
    private List<IListener1> canalesSMS = new ArrayList<>();
    
    public void suscribirEmail(IListener1 o){
        canalesEmail.add(o);
    }
    
    public void suscribirSMS(IListener1 o){
        canalesSMS.add(o);
    }
    
    public void notificarEmail(String msg){
        for(IListener1 i : canalesEmail){
            i.actualizar(msg);
        }
    }
    
    public void notificarSMS(String msg){
        for(IListener1 i : canalesSMS){
            i.actualizar(msg);
        }
    }
    
}
