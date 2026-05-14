package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

import java.util.HashMap;
import java.util.Map;

public class BotonFactory {
    
    public static Map<TipoOs, IBoton> registro = new HashMap<>();
    
    static{
        registro.put(TipoOs.WINDOWS, new BotonWindows());
        registro.put(TipoOs.MAC, new BotonMac());
    }
    
    public static IBoton crearBoton(TipoOs tipo){
        
        return registro.get(tipo);
    }
    
    
}
