package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

import java.util.HashMap;
import java.util.Map;

public class DecoradorCache extends RepositorioDecorator{
    
    private Map<Integer, String> memoria = new HashMap<>();
        
    public DecoradorCache(IRepositorio repositorio) {
        super(repositorio);
    }

    @Override
    public String buscarUsuario(int id) {
        if(memoria.containsKey(id)){
            System.out.println("Recuperado de memoria Caché rápida");
            return memoria.get(id);
        }else{
            memoria.put(id, super.buscarUsuario(id));
            return memoria.get(id);
        }    
    }
}
