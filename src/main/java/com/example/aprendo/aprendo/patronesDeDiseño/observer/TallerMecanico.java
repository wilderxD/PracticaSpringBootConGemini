package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class TallerMecanico implements IObservadorFlota{
 
    @Override
    public void actualizar(Camion camion) {
        System.out.println("Taller: Preparando repuestos para el camion placa " + camion.getPlaca());
    }
    
}
