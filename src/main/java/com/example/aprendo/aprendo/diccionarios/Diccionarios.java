package com.example.aprendo.aprendo.diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Diccionarios {

   
    public static void main(String[] args) {
        
        //1. HashMap
        Map<String, String> flota = new HashMap<>();
        //put
        flota.put("BAZ-911", "Volkswagen");
        flota.put("AEJ-934", "Hino");
        flota.put("BRH-832", "Mitsubishi");
        //Si se usa put con una llave ya existente actualiza el valor
        flota.put("AEJ-934", "Hino 500");
        //get(K), le das la clave y obtienes el valor si no existe te devuleve null
        String marca = flota.get("AEJ-934");
        System.out.println(marca);
        //containsKey(K) - verifica devulve true or false
        //util para no sobreescribir datos o evitar nullPointerException
        if(flota.containsKey("BRH-832")){
            System.out.println("El camion Existe en la base de datos.!");
        }else{
            System.out.println("placa no registrada");
        }
        
       //getOrDefault(K, V_por_defecto) - obtener seguro
       //Si la placa existe, te da la marca. sino te devulve el texto que pongas a la derecha
       String busqueda = flota.getOrDefault("BRH-884", "LA placa consultada no ah sido encontrada en la base de datos.");
        System.out.println(busqueda);        
        
        
        //2. LinkendHashMap
        Map<String, String> mantenimientos = new LinkedHashMap<>();
        //El orden importa aqui, registramos que se le hizo al camion cronologicamente
        mantenimientos.put("Lunes 08:00", "Cambio de aceite");
        mantenimientos.put("Martes 10:00", "Revision de frenos");
        mantenimientos.put("Miercoles 15:00", "Alineamiento");
        
        //Al imprimir, respetara exactamente el orden en que entraron
        for(Map.Entry<String, String> tarea : mantenimientos.entrySet()){
            System.out.println(tarea.getKey() + ": " + tarea.getValue());
        }
        
        //3. TreeMap
        TreeMap<String, Integer> stock = new TreeMap<>();
        stock.put("Z - repuesto", 10);
        stock.put("A - filtro", 50);
        stock.put("M - llanta", 20);
        
        System.out.println("Inventario" + stock);
        System.out.println("Primer puesto en la lista: " + stock.firstKey());
        
        //4.
        
        
    }
    
}
