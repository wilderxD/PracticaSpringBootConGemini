package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class TextoDecorator implements ITexto{
    
    protected ITexto texto;
    
    public TextoDecorator(ITexto texto){
        this.texto = texto;
    }

    @Override
    public String formatear(){
        return texto.formatear();
    }   
}
