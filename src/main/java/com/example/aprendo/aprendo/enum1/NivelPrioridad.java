package com.example.aprendo.aprendo.enum1;

public enum NivelPrioridad {
    
    ALTA,
    MEDIA,
    BAJA;          
    
    public boolean esMasUrgenteQue(NivelPrioridad otro){
        if(this.ordinal() > otro.ordinal()){
            System.out.println("el otro es mas urgente");
            return false;
        }
        return true;
    }
    
    
}
