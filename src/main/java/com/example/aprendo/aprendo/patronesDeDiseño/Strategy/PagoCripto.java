package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class PagoCripto implements IMetodoPago{

    @Override
    public void procesarPago(double monto) {
        
        System.out.println("Transfiriendo $" + monto + " a la wallet de Bitcoin.");
    }
    
}
