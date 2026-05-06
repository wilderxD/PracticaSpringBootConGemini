package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class Computadora {
    
    private String ram;
    private boolean tieneGrafica;

    private Computadora(String ram, boolean tieneGrafica) {
        this.ram = ram;
        this.tieneGrafica = tieneGrafica;
    }

    public String getRam() {
        return ram;
    }

    public boolean isTieneGrafica() {
        return tieneGrafica;
    }
    
    public static ComputadoraBuilder builder(){
        return new ComputadoraBuilder();
    }
    
    public static class ComputadoraBuilder{
        
        private String ram;
        private boolean tarjetaGrafica;
        
        public ComputadoraBuilder ram(String ram){
            this.ram = ram;
            return this;
        }
        
        public ComputadoraBuilder tienegrafica(){
            this.tarjetaGrafica = true;
            return this;
        }
        
        public Computadora build(){
            return new Computadora(ram, tarjetaGrafica);
        }
    }
    
}
