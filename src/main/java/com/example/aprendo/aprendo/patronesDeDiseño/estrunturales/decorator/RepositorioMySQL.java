package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class RepositorioMySQL implements IRepositorio{

    @Override
    public String buscarUsuario(int id) {
        System.out.println("Conectando a BD... buscando...");
        return "Usuario_" + id;
    }
    
}
