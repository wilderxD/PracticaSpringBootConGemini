package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class PagoFactory {
    
    public static IPago crearPago(TipoPago tipo, String correo){
        switch(tipo){
            case PAYPAL: 
                return new PagoPaypal(correo);
            case EFECTIVO:
                return new PagoEfectivo();
            default: 
                throw new IllegalArgumentException("Opcion no definida en la lista.!");
        }
    }
    
    
}
