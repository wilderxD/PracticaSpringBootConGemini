package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class PagoEfectivo implements IPago{

    @Override
    public boolean procesar(double monto) {
        return true;
    }
    
}
