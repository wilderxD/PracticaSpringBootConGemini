package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class CalculadoraPedidos {
    
    private IEstrategiaFlete estrategiaActual;
    
    public void setEstategia(IEstrategiaFlete estrategia){
        this.estrategiaActual = estrategia;
    }
    
    public double procesarEnvio(double peso){
        if(this.estrategiaActual == null){
            throw new IllegalStateException("!No has seleccionado unmetodo de envio!");
        }
        return this.estrategiaActual.calcularCosto(peso);
    }
    
}
