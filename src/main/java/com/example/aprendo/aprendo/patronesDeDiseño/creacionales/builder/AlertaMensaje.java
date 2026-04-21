package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class AlertaMensaje {
    private String destinatario;
    private String titulo;
    private boolean urgente;

    public AlertaMensaje(String destinatario, String titulo, boolean urgente) {
        this.destinatario = destinatario;
        this.titulo = titulo;
        this.urgente = urgente;
    }

    public AlertaMensaje() {
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isUrgente() {
        return urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }
    
    
}
