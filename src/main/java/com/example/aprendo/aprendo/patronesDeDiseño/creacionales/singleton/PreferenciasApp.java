package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class PreferenciasApp {
    
    private static PreferenciasApp instanciaUnica;
    
    private int volumen;
    private String idioma;
    
    private PreferenciasApp(){
        this.volumen = 0;
        this.idioma = "Español";
    }
    
    public static synchronized PreferenciasApp getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new PreferenciasApp();
        }
        return instanciaUnica;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
    
}
