package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class FleteProvincia implements IEstrategiaFlete{

    @Override
    public double calcularCosto(double peso) {
        return (peso * 5.0) + 100.0;
    }
    
}
