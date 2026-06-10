package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class FleteLocal implements IEstrategiaFlete{

    @Override
    public double calcularCosto(double peso) {
        return peso * 5.0;
    }
    
}
