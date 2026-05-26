package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class TextoPlano implements ITexto{

    public String contenido;
    
    public TextoPlano(String contenido){
        this.contenido = contenido;
    }
    
    @Override
    public String formatear() {
        return contenido;
    }
    
}
