package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class ConfiguracionGlobal {
    
    private static ConfiguracionGlobal instanciaUnica;
    
    private String idioma;
    private String tema;
    
    private ConfiguracionGlobal(){
        this.idioma = "Español";
        this.tema = "Claro";
    }
    
    public static ConfiguracionGlobal getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new ConfiguracionGlobal();
        }
        
        return instanciaUnica;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
    
}
