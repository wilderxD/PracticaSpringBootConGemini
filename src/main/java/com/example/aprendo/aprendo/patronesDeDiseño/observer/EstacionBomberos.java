package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class EstacionBomberos implements IObservador{

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Despachando camión de bomberos por: " + mensaje);
    }
    
}
