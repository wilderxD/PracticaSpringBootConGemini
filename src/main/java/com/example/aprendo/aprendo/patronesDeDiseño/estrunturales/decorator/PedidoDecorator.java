package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class PedidoDecorator implements IPedido{
    
    private IPedido pedido;
    
    public PedidoDecorator(IPedido pedido){
        this.pedido = pedido;
    }

    @Override
    public double calcularTotal(){
        return this.pedido.calcularTotal();
    }

    @Override
    public String obtenerDetalle(){
        return this.pedido.obtenerDetalle();
    }
    
}
