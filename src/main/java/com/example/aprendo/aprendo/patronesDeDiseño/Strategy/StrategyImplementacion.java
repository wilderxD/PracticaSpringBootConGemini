package com.example.aprendo.aprendo.patronesDeDiseño.Strategy;

public class StrategyImplementacion {

    public static void main(String[] args) {
        CalculadoraPedidos miCalculadora = new CalculadoraPedidos();
        
        double pesoPedido = 50.0;
        
        miCalculadora.setEstategia(new FleteLocal());
        System.out.println("Costo Local: " + miCalculadora.procesarEnvio(pesoPedido));
        
        miCalculadora.setEstategia(new FleteProvincia());
        System.out.println("Costo Provincia: " + miCalculadora.procesarEnvio(pesoPedido));
        
    }
    
    //1
    CarritoCompras cc = new CarritoCompras();
    
}
