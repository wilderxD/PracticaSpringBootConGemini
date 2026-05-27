package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorAutenticacion extends ConexionDecorator{
    
    public DecoradorAutenticacion(IConexionWeb conexion) {
        super(conexion);
    }

    @Override
    public void acceder(String usuario) {
        if(usuario.equals("wilder")){
            super.acceder(usuario);
        }else{
            System.out.println("Acceso denegado. Intento de intrusión bloqueado.");
        }
        
        
    }
    
}
