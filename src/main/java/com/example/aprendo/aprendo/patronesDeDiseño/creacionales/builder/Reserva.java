package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class Reserva {
    
    private String origen;
    private String destino;
    private String fecha;
    private boolean maletaExtra;
    private boolean seguro;
    private boolean ventana;
    private boolean comidaVegetariana;

    public Reserva(String origen, String destino, String fecha, boolean maletaExtra, boolean seguro, boolean ventana, boolean comidaVegetariana) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.maletaExtra = maletaExtra;
        this.seguro = seguro;
        this.ventana = ventana;
        this.comidaVegetariana = comidaVegetariana;
    }

    public Reserva() {
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isMaletaExtra() {
        return maletaExtra;
    }

    public void setMaletaExtra(boolean maletaExtra) {
        this.maletaExtra = maletaExtra;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean isVentana() {
        return ventana;
    }

    public void setVentana(boolean ventana) {
        this.ventana = ventana;
    }

    public boolean isComidaVegetariana() {
        return comidaVegetariana;
    }

    public void setComidaVegetariana(boolean comidaVegetariana) {
        this.comidaVegetariana = comidaVegetariana;
    }
    
    
    
}
