package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class EmpaquePremiun extends PedidoDecorator{
    
    public EmpaquePremiun(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + ", empaque reforzado"; 
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + 20.0;
    }
    
}
