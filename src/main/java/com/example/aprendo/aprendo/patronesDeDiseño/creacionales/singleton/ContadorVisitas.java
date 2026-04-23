package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class ContadorVisitas {
    
    private static ContadorVisitas instanciaUnica;
    
    private int conteo;
    
    private ContadorVisitas(){
         this.conteo = 0;
    }
    
    public static synchronized ContadorVisitas getInstance(){
        
        if(instanciaUnica == null){
            instanciaUnica = new ContadorVisitas();
        }        
        return instanciaUnica;
    }
    
    public void sumarVisita(){
        conteo++;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    
    
}
