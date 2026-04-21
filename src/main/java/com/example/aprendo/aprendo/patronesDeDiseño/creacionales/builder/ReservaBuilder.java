package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class ReservaBuilder {
    
    private Reserva reserva = new Reserva();
    
    public ReservaBuilder setOrigen(String origen){
        this.reserva.setOrigen(origen);
        return this;
    }
    
    public ReservaBuilder setDestino(String destino){
        this.reserva.setDestino(destino);
        return this;
    }
    
    public ReservaBuilder setFecha(String fecha){
        this.reserva.setFecha(fecha);
        return this;
    }
    
    public ReservaBuilder agreagrMaletaExtra(){
        this.reserva.setMaletaExtra(true);
        return this;
    }
    
    public ReservaBuilder ventana(){
        this.reserva.setVentana(true);
        return this;
    }
    
    public ReservaBuilder tieneSeguro(){
        this.reserva.setSeguro(true);
        return this;
    }
    
    public ReservaBuilder vegetariano(){
        this.reserva.setComidaVegetariana(true);
        return this;
    }
    
    public Reserva build(){
        if(reserva.getOrigen() == null || reserva.getDestino() == null){
            throw new RuntimeException("La reserva debe tener un origen y un destio de llegada para poder ser procesada.!!");
        }
        return this.reserva;
    }
    
}
