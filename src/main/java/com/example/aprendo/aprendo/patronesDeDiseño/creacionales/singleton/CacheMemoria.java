package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

import java.util.HashMap;

public class CacheMemoria {
    
    private static CacheMemoria instanciaUnica;
    
    private HashMap<String, String> datos;
    
    private CacheMemoria(){
        this.datos = new HashMap<>();
    }
    
    public static synchronized CacheMemoria getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new CacheMemoria();
        }
        return instanciaUnica;
    }
    
    public void guardarValor(String clave, String valor){
        datos.put(clave, valor);
    }
    
    public String obtenerValor(String clave){
        return datos.get(clave);
    }

    public HashMap<String, String> getDatos() {
        return datos;
    }

    public void setDatos(HashMap<String, String> datos) {
        this.datos = datos;
    }
}
