package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class EventoSistema {
    private String tipo;
    private String descripcion;

    public EventoSistema(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getInfo() {
        return tipo;
    }

    public void setInfo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
