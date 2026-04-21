package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class AlertaMensajeBuilder {
    
    private AlertaMensaje mensaje = new AlertaMensaje();
    
    public AlertaMensajeBuilder setDestinatario(String destinatario){
        this.mensaje.setDestinatario(destinatario);
        return this;        
    }
    
    public AlertaMensajeBuilder setTitulo(String titulo){
        this.mensaje.setTitulo(titulo);
        return this;
    }
    
    public AlertaMensajeBuilder esUrgente(){
        this.mensaje.setUrgente(true);
        return this;
    }
    
    public AlertaMensaje build(){
        if(mensaje.getDestinatario() == null){
            throw new RuntimeException("El mensaje debe tener un destinatario para poder ser enviado!!.");
        }
        return this.mensaje;
    }
    
}
