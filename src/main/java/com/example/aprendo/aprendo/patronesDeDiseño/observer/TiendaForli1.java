package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class TiendaForli1 implements IObservable1{
    private int stock = 0;
    private List<IObservadorTienda> suscriptores = new ArrayList<>();
    
    public void llegadaMercaderia(int cantidad){
        this.stock += cantidad;
        notificarTodos();
    }

    @Override
    public void suscribir(IObservadorTienda t) {
        suscriptores.add(t);
    }

    @Override
    public void desuscribir(IObservadorTienda t) {
        suscriptores.remove(t);
    }

    @Override
    public void notificarTodos() {
        List<IObservadorTienda> copiaSegura = new ArrayList<>(suscriptores);
        for(IObservadorTienda t : copiaSegura){
            t.actualizar(this);
        }
    }

    public int getStock() {
        return stock;
    }
    
}
