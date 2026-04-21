package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class EmailBuilder {
    
    private Email email = new Email();
    
    public EmailBuilder setRemitente(String remitente){
        this.email.setRemitente(remitente);
        return this;
    }
    
    public EmailBuilder setDestinatario(String destinatario){
        this.email.setDestinatario(destinatario);
        return this;
    }
    
    public EmailBuilder setAsunto(String asunto){
        this.email.setAsunto(asunto);
        return this;
    }
    
    public EmailBuilder setCuerpo(String cuerpo){
        this.email.setCuerpo(cuerpo);
        return this;
    }
    
    public EmailBuilder Archivo(){
        this.email.setConArchivo(true);
        return this;
    }
    
    public Email build(){
        if(email.getDestinatario() == null || email.getCuerpo() == null){
            throw new IllegalArgumentException("Flatan datos obligatorios");
        }
        
        return this.email;
    }
}
