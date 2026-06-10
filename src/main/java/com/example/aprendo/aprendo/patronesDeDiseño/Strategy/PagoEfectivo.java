package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class PagoEfectivo implements IMetodoPago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " en efectivo. Sin comisiones.");
    }
    
}
