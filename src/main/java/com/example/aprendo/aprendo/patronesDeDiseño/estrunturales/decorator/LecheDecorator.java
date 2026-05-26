package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class LecheDecorator extends CafeDecorator{
    
    public LecheDecorator(ICafe cafeEnvuelto) {
        super(cafeEnvuelto); // le pasamos el argumento al padre
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + ", con Leche"; //añadimos nuestro texto
    }

    @Override
    public double getCosto() {
        return super.getCosto() + 0.50; // le sumamos 50 centavos a lo que ya tenia
    }
    
    
    
}
