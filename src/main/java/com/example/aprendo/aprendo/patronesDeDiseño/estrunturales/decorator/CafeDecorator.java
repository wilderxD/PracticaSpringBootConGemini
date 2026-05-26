package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

//hacemos la clase abstracta porque solo sirve como molde para los ingredientes
public abstract class CafeDecorator implements ICafe{
    
    protected ICafe cafeEnvuelto; // lo que vamos a envolver

    public CafeDecorator(ICafe cafeEnvuelto){
        this.cafeEnvuelto = cafeEnvuelto;
    }
    
    @Override
    public double getCosto() {
        return cafeEnvuelto.getCosto(); //Delega al  objeto que tiene adentro
    }

    @Override
    public String getDescripcion() {
        return cafeEnvuelto.getDescripcion(); // Delega al objeto que tiene adentro
    }
    
}
