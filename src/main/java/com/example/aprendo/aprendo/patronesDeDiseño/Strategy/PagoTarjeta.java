package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class PagoTarjeta implements IMetodoPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Cobrando $" + monto + " a la tarjeta de crédito. Comisión 5%.");
    }
    
}
