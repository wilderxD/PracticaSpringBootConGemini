package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class TransporteFactory {
    
    public static ITransporte crearTransporte(TipoTransporte tipo){
        switch(tipo){
            case TERRESTRE: 
                return new Camion();
            case MARITIMO: 
                return new Barco();
            default: throw new IllegalArgumentException("La opcion elegida no esta definida.!");           
        }
    };
}
