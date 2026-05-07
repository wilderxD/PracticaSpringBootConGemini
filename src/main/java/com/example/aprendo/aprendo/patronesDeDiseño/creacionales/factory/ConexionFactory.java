package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

import java.util.HashMap;
import java.util.Map;

public class ConexionFactory {
    
    private static Map<TipoDB, IConexionDB> cache = new HashMap<>();

    public static IConexionDB obtenerConexion(TipoDB tipo){
        if(cache.containsKey(tipo)){
            System.out.println("Devolviendo conexion desde el cache.!");
            return cache.get(tipo);            
        }
        System.out.println("No existe, fabricando conexion...");
        IConexionDB nuevaConexion = null;
        
        switch(tipo){
            case MYSQL:
                nuevaConexion = new ConexionMySQL();
                break;
            case ORACLE:
                nuevaConexion = new ConexionOracle();
                break;
            default: throw new IllegalArgumentException("La opcion solicitada aun no esta definida.!");
        }
        cache.put(tipo, nuevaConexion);
        return nuevaConexion;
    }
    
    
    
}
