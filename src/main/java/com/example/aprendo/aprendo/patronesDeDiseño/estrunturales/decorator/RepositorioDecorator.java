package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class RepositorioDecorator implements IRepositorio{
    
    private IRepositorio repositorio;

    public RepositorioDecorator(IRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public String buscarUsuario(int id){
        return repositorio.buscarUsuario(id);
    }

    
}
