package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class EntregaProvincia extends PedidoDecorator{
    
    public EntregaProvincia(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + ", envio a provincia";
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() +  100.0;
    }
    
}
