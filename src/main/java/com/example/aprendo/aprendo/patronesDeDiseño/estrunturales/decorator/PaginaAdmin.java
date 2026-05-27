package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class PaginaAdmin implements IConexionWeb{

    @Override
    public void acceder(String usuario) {
        System.out.println("Bienvenido al panel de administracion: " + usuario);
    }
    
}
