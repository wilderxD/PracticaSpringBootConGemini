package com.example.aprendo.aprendo.enum1;

public enum Moneda {
    
    SOLES("S/."),
    DOLARES("$."),
    EUROS("e");
    
    private String simbolo;
    
    private Moneda(String simbolo){
        this.simbolo = simbolo;
    }
    
    public static Moneda buscarPorSimbolo(String simboloBuscado){
        
        for(Moneda e : Moneda.values()){
            if(e.getSimbolo().equals(simboloBuscado)){
                return e;
            }           
        }
        throw new IllegalArgumentException("Simbolo de moenda no reconocido " + simboloBuscado);
    }

    public String getSimbolo() {
        return simbolo;
    }
    
    
    
}
