package com.example.aprendo.aprendo.enum1;

public enum OperacionMatematica {
    
    SUMA{
        @Override
        public double aplicar(double x, double y){
            return x + y;
        }
    },
    RESTA{
        @Override
        public double aplicar(double x, double y){
            return x - y;
        }
    },
    MULTIPLICACION{
        @Override
        public double aplicar(double x, double y){
            return x * y;
        }
    },
    DIVISION{
        @Override
        public double aplicar(double x, double y){
            if(y == 0){
                System.out.println("No se puede dividir entre 0");
                return 0.0;
            }
            return x / y;
        }
    };
    
    public abstract double aplicar(double x, double y);
}
