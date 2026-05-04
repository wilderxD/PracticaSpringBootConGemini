package com.example.aprendo.aprendo.enum1;

public enum EstadoDocumento {
    
    BORRADOR,
    REVISION,
    APROVADO,
    RECHAZADO;
    
    public EstadoDocumento siguientePaso(){
        switch(this){
            case BORRADOR: return REVISION;
            case REVISION: return APROVADO;
            case APROVADO: return this;
            case RECHAZADO: return REVISION;            
        }
        return null;
    }
    
}
