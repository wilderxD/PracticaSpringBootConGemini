package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class ProcesadorDecorator implements IProcesadorDatos{

    private IProcesadorDatos procesador;
    
    public ProcesadorDecorator(IProcesadorDatos procesador){
        this.procesador = procesador;
    }
    
    @Override
    public String procesar(String texto) {
        return this.procesador.procesar(texto);
    }
    
}
