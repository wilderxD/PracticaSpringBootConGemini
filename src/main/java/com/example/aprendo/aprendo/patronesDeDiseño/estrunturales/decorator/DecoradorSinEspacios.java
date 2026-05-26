package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorSinEspacios extends ProcesadorDecorator{
    
    public DecoradorSinEspacios(IProcesadorDatos procesador) {
        super(procesador);
    }

    @Override
    public String procesar(String texto) {
        return super.procesar(texto).replace(" ","");
    }
    
}
