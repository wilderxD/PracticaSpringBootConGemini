package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorMayusculas extends ProcesadorDecorator{
    
    public DecoradorMayusculas(IProcesadorDatos procesador) {
        super(procesador);
    }

    @Override
    public String procesar(String texto) {
        return super.procesar(texto).toUpperCase();
    }
    
}
