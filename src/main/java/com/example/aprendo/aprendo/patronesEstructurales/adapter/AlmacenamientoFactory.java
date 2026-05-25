package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class AlmacenamientoFactory {
    
    public IAlmacenamiento crearAlmacenamiento(String tipo){
        if(tipo.equals("NUBE")){
            return new AlmacenamientoNube();
        }else if(tipo.equals("LOCAL")){
            return new AdaptadorLocal(new AlmacenamientoLocal());
        }
        return null;
    }
}
