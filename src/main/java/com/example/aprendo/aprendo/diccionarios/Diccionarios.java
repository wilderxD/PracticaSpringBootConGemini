package com.example.aprendo.aprendo.diccionarios;

import java.util.LinkedHashMap;
import java.util.Map;

public class Diccionarios {

   
    public static void main(String[] args) {
        
        Map<String, String> mantenimientos = new LinkedHashMap<>();
        //El orden importa aqui, registramos que se le hizo al camion cronologicamente
        mantenimientos.put("Lunes 08:00", "Cambio de aceite");
        mantenimientos.put("Martes 10:00", "Revision de frenos");
        mantenimientos.put("Miercoles 15:00", "Alineamiento");
        
        //Al imprimir 
        
    }
    
}
