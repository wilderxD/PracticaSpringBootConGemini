package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class Computadora {
    
    private String cpu;
    private int ram;
    private String tarjetaGrafica;
    private boolean tieneBluetooth;

    
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }
    
    
}
