package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class GestorSeguridad {
    
    private static final GestorSeguridad instanciaUnica = new GestorSeguridad();
    
    private GestorSeguridad(){
        
    }
    
    public GestorSeguridad getInstance(){
        return instanciaUnica;
    }
    
}
