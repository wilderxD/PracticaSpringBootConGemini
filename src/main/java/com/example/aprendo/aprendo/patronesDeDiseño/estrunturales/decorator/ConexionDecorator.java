package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class ConexionDecorator implements IConexionWeb{

    private IConexionWeb conexion;
    
    public ConexionDecorator(IConexionWeb conexion){
        this.conexion = conexion;
    }
    
    @Override
    public void acceder(String usuario){
        conexion.acceder(usuario);
    }
    
}
