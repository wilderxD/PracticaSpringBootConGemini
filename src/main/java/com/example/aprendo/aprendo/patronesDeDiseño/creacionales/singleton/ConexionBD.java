package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class ConexionBD {
    
    private static ConexionBD instanciaUnica;
    
    private String host;
    private String puerto;
    private String estado;
    
    private ConexionBD(){
        this.host = "192.168.1.1";
        this.puerto = "8080";
        this.estado = "Desconectado";
    }
    
    public static synchronized ConexionBD getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new ConexionBD();
        }
        return instanciaUnica;
    }
    
    public void conectar(){
        this.estado = "Conectado";
    }
    
    public void Desconectar(){
        this.estado = "Desconectado";
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
