package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class Email {
    
    private String remitente;
    private String destinatario;
    private String asunto;
    private String cuerpo;
    private boolean conArchivo;

    public Email(String remitente, String destinatario, String asunto, String cuerpo, boolean conArchivo) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.conArchivo = conArchivo;
    }

    public Email() {
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public boolean isConArchivo() {
        return conArchivo;
    }

    public void setConArchivo(boolean conArchivo) {
        this.conArchivo = conArchivo;
    }
    
    
}
