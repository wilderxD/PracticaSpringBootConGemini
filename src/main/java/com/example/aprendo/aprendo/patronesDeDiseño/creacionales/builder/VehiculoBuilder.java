package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class VehiculoBuilder {
    
    private Vehiculo vehiculo = new Vehiculo();
    
    public VehiculoBuilder setMarca(String marca){
        this.vehiculo.setMarca(marca);
        return this;
    }
    
    public VehiculoBuilder setModelo(String modelo){
        this.vehiculo.setModelo(modelo);
        return this;
    }
    
    public VehiculoBuilder setColor(String color){
        this.vehiculo.setColor(color);
        return this;
    }
    
    public VehiculoBuilder setPuertas(int puertas){
        this.vehiculo.setPuertas(puertas);
        return this;
    }
    
    public VehiculoBuilder conAireAcondicionado(){
        this.vehiculo.setTieneAireAcondicionado(true);
        return this;
    }
    
    public VehiculoBuilder conNavegador(){
        this.vehiculo.setTieneNavegador(true);
        return this;
    }
    
    public Vehiculo build(){
        if(vehiculo.getMarca() == null){
            throw new RuntimeException("El vehiculo debe tener marca para poder asignar las demas prioridades");
        }
        return this.vehiculo;
    }
    
}
