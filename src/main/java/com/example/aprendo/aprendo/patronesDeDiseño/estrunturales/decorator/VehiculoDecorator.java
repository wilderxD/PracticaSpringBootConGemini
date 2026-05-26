package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public abstract class VehiculoDecorator implements IVehiculo{

    private IVehiculo vehiculo;
    
    public VehiculoDecorator(IVehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    @Override
    public double getPrecio(){
        return this.vehiculo.getPrecio();
    }

    @Override
    public String getEquipamiento(){
        return this.vehiculo.getEquipamiento();
    }
    
    
    
}
