package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorSubrayado extends TextoDecorator{
    
    public DecoradorSubrayado(ITexto texto) {
        super(texto);
    }

    @Override
    public String formatear() {
        return "<u>" + super.formatear() + "</u>";
    }
    
}
