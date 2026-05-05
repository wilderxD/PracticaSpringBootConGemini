package com.example.aprendo.aprendo.enum1;

public enum EstadoTarea {
    
    TODO,
    IN_PROGRESS,
    DONE;
    
    public boolean puedePasarA(EstadoTarea nuevoEstado){
        switch(this){
            case TODO: 
                if(nuevoEstado == IN_PROGRESS){
                    return true;
                }else{
                    return false;
                }
                
            case IN_PROGRESS: 
                if(nuevoEstado == DONE){
                    return true;
                }else{
                    return false;
                }
                
            case DONE: return false;
        }
        return false;
    }
    
}
