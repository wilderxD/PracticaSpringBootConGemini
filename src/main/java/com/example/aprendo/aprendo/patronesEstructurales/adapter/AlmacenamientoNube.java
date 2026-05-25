package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class AlmacenamientoNube implements IAlmacenamiento{

    @Override
    public void subirArchivo() {
        System.out.println("Subiendo a AWS...");
    }
    
}
