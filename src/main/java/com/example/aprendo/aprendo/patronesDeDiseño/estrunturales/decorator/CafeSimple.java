package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class CafeSimple implements ICafe{

    @Override
    public double getCosto() {
        return 2.00;
    }

    @Override
    public String getDescripcion() {
        return "Café Simple";
    }
    
}
