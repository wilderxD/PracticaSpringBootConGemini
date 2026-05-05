package com.example.aprendo.aprendo.enum1;

public enum NivelEmpleado {
    
    JUNIOR(1.0){
        @Override
        public double calcularBono(double salarioBase){
            return this.getMultiplicador() * salarioBase;
        }
    },
    PLENO(1.5){
        @Override
        public double calcularBono(double salarioBase){
            return this.getMultiplicador() * salarioBase;
        }
    },
    SENIOR(2){
        @Override
        public double calcularBono(double salarioBase){
            return this.getMultiplicador() * salarioBase;
        }
    };
    
    private double multiplicador;

    private NivelEmpleado(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public double getMultiplicador() {
        return multiplicador;
    }
            
    public abstract double calcularBono(double salarioBase);
}
