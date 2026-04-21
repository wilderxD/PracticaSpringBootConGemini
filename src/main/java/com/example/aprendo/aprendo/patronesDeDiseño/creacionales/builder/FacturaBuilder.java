package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

import java.util.Date;

public class FacturaBuilder {
    
    private Factura factura = new Factura();
    
    public FacturaBuilder setNumeroF(String numeroF){
        this.factura.setNumeroF(numeroF);
        return this;
    }
    
    public FacturaBuilder setCliente(String cliente){
        this.factura.setCliente(cliente);
        return this;
    }
    
    public FacturaBuilder setFecha(Date fecha){
        this.factura.setFecha(fecha);
        return this;                
    }
    
    public FacturaBuilder setMonto(Double monto){
        this.factura.setMonto(monto);
        return this;
    }
    
    public FacturaBuilder tieneDescuento(){
        this.factura.setConDescuento(true);
        return this;
    }
    
    public FacturaBuilder tieneTarjeta(){
        this.factura.setPagoTarjeta(true);
        return this;
    }
    
    public FacturaBuilder clienteVip(){
        this.factura.setClienteVip(true);
        return this;
    }
    
    public FacturaBuilder setObservaciones(String observaciones){
        this.factura.setObservacion(observaciones);
        return this;
    }
    
    public Factura build(){
        if(factura.getMonto() == null || factura.getMonto() <= 0){
            throw new RuntimeException("La factura tiene que tener un monto y ese monto no puede ser 0.!!");
        }
        return this.factura;
    }
    
}
