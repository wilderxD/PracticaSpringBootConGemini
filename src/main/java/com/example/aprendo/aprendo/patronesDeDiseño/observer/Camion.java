package com.example.aprendo.aprendo.patronesDeDiseño.observer;

import java.util.ArrayList;
import java.util.List;

public class Camion implements IObservableFlota{

    private String placa;
    private String estado;
    private List<IObservadorFlota> suscriptores = new ArrayList<>();

    public Camion(String placa) {
        this.placa = placa;
        this.estado = "OPERATIVO";
    }
    
    public void cambiarEstado(String estado){
        this.estado = estado;
        notificarTodos();
    }

    @Override
    public void suscribir(IObservadorFlota o) {
        suscriptores.add(o);
    }

    @Override
    public void desuscribir(IObservadorFlota o) {
        suscriptores.remove(o);
    }

    @Override
    public void notificarTodos() {
        for(IObservadorFlota c : suscriptores){
            c.actualizar(this);
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<IObservadorFlota> getSuscriptores() {
        return suscriptores;
    }

    public void setSuscriptores(List<IObservadorFlota> suscriptores) {
        this.suscriptores = suscriptores;
    }
    
}
