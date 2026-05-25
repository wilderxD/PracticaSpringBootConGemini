package com.example.aprendo.aprendo.patronesEstructurales.adapter;


public class MotorAdapter implements IMotorElectrico{
    
    private MotorCombustion viejo;

    public MotorAdapter(MotorCombustion viejo) {
        this.viejo = viejo;
    }

    @Override
    public void encender() {
        viejo.arrancar();
    }

    @Override
    public void aumnetarVelocidad() {
        viejo.acelerar();
    }
    
}
