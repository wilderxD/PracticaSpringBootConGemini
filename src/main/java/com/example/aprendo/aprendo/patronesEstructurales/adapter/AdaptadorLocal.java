package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class AdaptadorLocal implements IAlmacenamiento{
    
    private AlmacenamientoLocal aLocal;

    public AdaptadorLocal(AlmacenamientoLocal aLocal) {
        this.aLocal = aLocal;
    }

    @Override
    public void subirArchivo() {
        aLocal.guardarEnDisco();
    }
    
}
