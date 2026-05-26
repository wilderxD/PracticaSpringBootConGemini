package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoradorAireAcondicionado extends VehiculoDecorator{
    
    public DecoradorAireAcondicionado(IVehiculo vehiculo) {
        super(vehiculo);
    }

    @Override
    public String getEquipamiento() {
        return super.getEquipamiento() + ", con Aire acondicionado";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 1200;
    }
    
}
