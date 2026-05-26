package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorAsientosCuero extends VehiculoDecorator{
    
    public DecoradorAsientosCuero(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getEquipamiento() {
        return super.getEquipamiento() + ", con Asientos de cuero";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 2500;
    }
    
    
    
}
