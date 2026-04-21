package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class HamburguesaBuilder {
    
    private String nombre;
    private String tamanio;
    private boolean conTomate;
    private boolean conCebolla;
    private boolean conSalsa;
    
    public HamburguesaBuilder setNombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    
    public HamburguesaBuilder setTamanio(String tamanio){
        this.tamanio = tamanio;
        return this;
    }
    
    public HamburguesaBuilder tomate(){
        this.conTomate = true;
        return this;
    }
    
    public HamburguesaBuilder cebolla(){
        this.conCebolla = true;
        return this;
    }
    
    public HamburguesaBuilder salsa(){
        this.conSalsa = true;
        return this;
    }
    
    public Hamburguesa build(){
        return new Hamburguesa(nombre, tamanio, conTomate, conCebolla, conSalsa);       
    }
    
}
