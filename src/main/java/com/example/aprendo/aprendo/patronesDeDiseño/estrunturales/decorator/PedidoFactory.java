package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class PedidoFactory {
    
    public static IPedido crearPedidoPersonalizado(boolean quiereGarantia, boolean quiereEnvio, boolean quiereEmpaque){
        IPedido pedido = new PedidoColchon();
        if(quiereGarantia == true){
           pedido = new GarantiaExtendida(pedido); 
        }
        if(quiereEnvio == true){
            pedido = new EntregaProvincia(pedido);
        }
        if(quiereEmpaque == true){
            pedido = new EmpaquePremiun(pedido);
        }
        
        return pedido;
    }
    
}
