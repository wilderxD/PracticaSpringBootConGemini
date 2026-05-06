package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

import java.util.Random;

public class EnemigoFactory {
    
    public static IEnemigo crearEnemigoAleatorio(){
        
        Random random = new Random();
        int numero = random.nextInt(2);
        TipoEnemigo[] te = TipoEnemigo.values();
        
        switch(numero){
            case 0:
                return new Orco();
            case 1:
                return new Goblin();
            default: 
                throw new IllegalArgumentException("EL enemigo seleccionado no esta disponible!!.");
        }
        
    }
    
}
