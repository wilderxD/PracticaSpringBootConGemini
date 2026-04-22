package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class Logger {
    
    private static Logger instanciaUnica;
    
    private String mensaje;
    
    private Logger(){
        this.mensaje = "";
    }
    
    public static synchronized Logger getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new Logger();
        }
        return instanciaUnica;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }    
    
    public void escribirLog(String mensaje){
        System.out.println("[LOG]: " + mensaje);
    }
}
