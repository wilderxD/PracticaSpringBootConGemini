package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class Arco implements IArma{
    
    private int danioBase;

    public Arco(int danioBase) {
        this.danioBase = danioBase;
    }
    

    @Override
    public int hacerDanio() {
        return danioBase + 50;
    }
    
}
