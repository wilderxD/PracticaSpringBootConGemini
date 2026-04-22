package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class SesionActual {
    
    private static SesionActual instanciaUnica;
    
    private Usuario usuario;
    private String estado;
    
    private SesionActual(){
        this.estado = "no hay sesion iniciada.";
        this.usuario = new Usuario();
    }
    
    public static synchronized SesionActual getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new SesionActual();
        }
        return instanciaUnica;
    }
    
    public void iniciarSesion(Usuario u){
        this.usuario = u;
        System.out.println("Sesion Iniciada con el usuario: " + u.getNombre());
        this.estado = "Sesion iniciada";
    }
    
    public void cerrarSesion(){
        this.estado = "no hay sesion iniciada.";
        System.out.println("Sesion cerrada con exito.");
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
