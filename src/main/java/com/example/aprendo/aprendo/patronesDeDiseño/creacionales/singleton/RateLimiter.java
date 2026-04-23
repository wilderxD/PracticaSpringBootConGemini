package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class RateLimiter {
    
    private static RateLimiter instanciaUnica;
    
    private static int peticionesActuales;
    
    public RateLimiter(){
        this.peticionesActuales = 0;        
    }
    
    public static synchronized RateLimiter getInstance(){
        permitePeticiones();
        if(instanciaUnica == null){
            instanciaUnica = new RateLimiter();
        }
        
        return instanciaUnica;
    }
    
    private static boolean permitePeticiones(){
        if(peticionesActuales >= 5){
            System.out.println("Estas excediendo la cantidad de conexiones  maxima permitidas.!");
            return false;
        }else{
            peticionesActuales++;
            return true;
        }
    }
    
}
