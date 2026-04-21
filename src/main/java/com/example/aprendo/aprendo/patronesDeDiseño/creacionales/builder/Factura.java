package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

import java.util.Date;


public class Factura {
    
    private String numeroF;
    private String cliente;
    private Date fecha;
    private Double monto;
    private boolean conDescuento;
    private boolean pagoTarjeta;
    private boolean clienteVip;
    private String observacion;

    public Factura() {
    }
        
    public Factura(String numeroF, String cliente, Date fecha, Double monto, boolean conDescuento, boolean pagoTarjeta, boolean clienteVip, String observacion) {
        this.numeroF = numeroF;
        this.cliente = cliente;
        this.fecha = fecha;
        this.monto = monto;
        this.conDescuento = conDescuento;
        this.pagoTarjeta = pagoTarjeta;
        this.clienteVip = clienteVip;
        this.observacion = observacion;
    }

    public String getNumeroF() {
        return numeroF;
    }

    public void setNumeroF(String numeroF) {
        this.numeroF = numeroF;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public boolean isConDescuento() {
        return conDescuento;
    }

    public void setConDescuento(boolean conDescuento) {
        this.conDescuento = conDescuento;
    }

    public boolean isPagoTarjeta() {
        return pagoTarjeta;
    }

    public void setPagoTarjeta(boolean pagoTarjeta) {
        this.pagoTarjeta = pagoTarjeta;
    }

    public boolean isClienteVip() {
        return clienteVip;
    }

    public void setClienteVip(boolean clienteVip) {
        this.clienteVip = clienteVip;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    
}
