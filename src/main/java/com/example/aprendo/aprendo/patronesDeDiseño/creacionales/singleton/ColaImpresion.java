package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

import java.util.ArrayList;
import java.util.List;

public class ColaImpresion {
    
    private static ColaImpresion instanciaUnica;
    
    private List<String> trabajos;
    
    private ColaImpresion(){
        this.trabajos = new ArrayList<>();
    }
    
    public static synchronized ColaImpresion getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new ColaImpresion();
        }
        return instanciaUnica;
    }
    
    public void imprimirSiguiente(){
        System.out.println(trabajos.getFirst());
        trabajos.remove(0);        
    }
    
    public void agregarTrabajo(String trabajo){
        trabajos.add(trabajo);
    }

    public List<String> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(List<String> trabajos) {
        this.trabajos = trabajos;
    }
    
    
    
}
