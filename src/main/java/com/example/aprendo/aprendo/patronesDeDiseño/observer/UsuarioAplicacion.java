package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class UsuarioAplicacion implements IObservador{
    private String nombreUsuario;

    public UsuarioAplicacion(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
        
    @Override
    public void actualizar(String mensaje) {
        System.out.println("Hola "+ nombreUsuario + ", notificación recibida: " + mensaje);
    }
    
    
    
}
