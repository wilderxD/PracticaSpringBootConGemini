package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class PagoPaypal implements IPago{

    private String correoCuenta;

    public PagoPaypal(String correoCuenta) {
        this.correoCuenta = correoCuenta;
    }
    
        
    @Override
    public boolean procesar(double monto) {
        return true;
    }
    
}
