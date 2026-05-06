package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class ArmeriaFactory {
    
    public static IArma crearArma(TipoArma tipo){
        
        switch(tipo){
            case ARCO:
                return new Arco(20);
            case ESPADA:
                return new Espada(50);
            default: throw new IllegalArgumentException("La opcion ingresada no es ");
        }
        
    }
    
}
