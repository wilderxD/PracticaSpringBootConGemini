package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class Pizza {
    private String tipoMaza;
    private String salsa;
    private boolean tieneQueso;
    private boolean tienePeperoni;
    private boolean bordeRelleno;

    public String getTipoMaza() {
        return tipoMaza;
    }

    public void setTipoMaza(String tipoMaza) {
        this.tipoMaza = tipoMaza;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public boolean isTieneQueso() {
        return tieneQueso;
    }

    public void setTieneQueso(boolean tieneQueso) {
        this.tieneQueso = tieneQueso;
    }

    public boolean isTienePeperoni() {
        return tienePeperoni;
    }

    public void setTienePeperoni(boolean tienePeperoni) {
        this.tienePeperoni = tienePeperoni;
    }

    public boolean isBordeRelleno() {
        return bordeRelleno;
    }

    public void setBordeRelleno(boolean bordeRelleno) {
        this.bordeRelleno = bordeRelleno;
    }
    
    
    
}
