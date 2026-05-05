package com.example.aprendo.aprendo.enum1;

public enum TipoEnvio {
    
    NORMAL{
        @Override
        public double calcularCosto(double pesoKg){
            return pesoKg * 5;
        }
    },
    EXPRESS{
        @Override
        public double calcularCosto(double pesoKg){
            return pesoKg * 10;
        }
    },
    SAME_DAY{
        @Override
        public double calcularCosto(double pesoKg){
            return pesoKg * 20;
        }
    };
    
    public abstract double calcularCosto(double pesoKg);
    
}
