package com.example.aprendo.aprendo.enum1;

public enum Semaforo {
    
    ROJO(45),
    AMBAR(5),
    VERDE(60);
    
    private int segundosDuracion;
    
    private Semaforo(int segundosDuracion){
        this.segundosDuracion = segundosDuracion;
    }

    public int getSegundosDuracion() {
        return segundosDuracion;
    }
        
}
