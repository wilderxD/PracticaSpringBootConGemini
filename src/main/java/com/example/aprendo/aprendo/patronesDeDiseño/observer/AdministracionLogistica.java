package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class AdministracionLogistica implements IObservadorFlota{

    @Override
    public void actualizar(Camion camion) {
        System.out.println("Logística: Reasignando rutas porque el camión " + camion.getPlaca() + " esta " + camion.getEstado());
    }
    
}
