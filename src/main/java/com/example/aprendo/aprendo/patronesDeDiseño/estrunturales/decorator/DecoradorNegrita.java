package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorNegrita extends TextoDecorator{
    
    public DecoradorNegrita(ITexto texto) {
        super(texto);
    }

    @Override
    public String formatear() {
        return "<b>" + super.formatear() + "</b>";
    }
    
}
