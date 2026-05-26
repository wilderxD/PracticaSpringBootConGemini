package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class CocheEstandar implements IVehiculo{

    @Override
    public String getEquipamiento() {
        return "Coche Estandar";
    }

    @Override
    public double getPrecio() {
        return 15000;
    }
    
    
    
}
