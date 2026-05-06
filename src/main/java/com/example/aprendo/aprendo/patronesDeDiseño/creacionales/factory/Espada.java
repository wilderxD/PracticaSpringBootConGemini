package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class Espada implements IArma{

    private int danioBase;

    public Espada(int danioBase) {
        this.danioBase = danioBase;
    }
    
    
    @Override
    public int hacerDanio() {
        return danioBase + 70;
    }
    
}
