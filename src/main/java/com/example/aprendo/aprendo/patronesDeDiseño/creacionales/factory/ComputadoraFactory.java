package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class ComputadoraFactory {
    
    public static Computadora crearPcGamer(){
        return Computadora.builder()
                .ram("32 gb")
                .tienegrafica()
                .build();
    }
    
    public static Computadora crearPcOficina(){
        return Computadora.builder()
                .ram("8GB")
                .build();
    }
}
