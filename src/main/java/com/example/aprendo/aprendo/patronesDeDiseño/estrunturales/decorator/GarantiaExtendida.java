package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class GarantiaExtendida extends PedidoDecorator{
    
    public GarantiaExtendida(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + ", garantia 5 años";
    }

    @Override
    public double calcularTotal() {
        return super.calcularTotal() + 50.0;
    }
    
}
