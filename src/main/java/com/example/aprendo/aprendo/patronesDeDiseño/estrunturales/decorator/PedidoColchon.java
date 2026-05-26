package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class PedidoColchon implements IPedido{

    @Override
    public String obtenerDetalle() {
        return "Colchon Ortopedico";
    }

    @Override
    public double calcularTotal() {
        return 500.0;
    }
    
}
