package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class Hamburguesa {
    
    private String nombre;
    private String tamanio;
    private boolean conTomate;
    private boolean conCebolla;
    private boolean conSalsas;

    protected Hamburguesa(String nombre, String tamanio, boolean conTomate, boolean conCebolla, boolean conSalsas) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.conTomate = conTomate;
        this.conCebolla = conCebolla;
        this.conSalsas = conSalsas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public boolean isConTomate() {
        return conTomate;
    }

    public boolean isConCebolla() {
        return conCebolla;
    }

    public boolean isConSalsas() {
        return conSalsas;
    }
    
    
}
