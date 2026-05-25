package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class ImpresoraClassAdapter extends ImpresoraAntigua implements IImpresoraModerna{

    @Override
    public void imprimir() {
        this.imprimirTinta();
    }
    
}
