package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton;

public class Presidente {
    //Paso 1: Una variable privada y estatica que guardara la unica instancia .
    //Al ser estatica, pertenece a la clase en si, no a los objetos individuales que se generen de ella 
    private static Presidente instanciaUnica;
    
    private String nombre;
    
    //Paso 2: El constructor debe ser privado
    //Esto es magia negra: Le prohibes a todo el mundo hacer un new Presidente()
    private Presidente(){
        this.nombre = "Wilder";
    }
    
    //Paso 3: El metodo estaticos "getInstance()" (Obtener Instancia)
    //Esta es la unica puerta de entrada
    public static Presidente getInstance(){
        //La inicializacion perezosa (Lazy Initialization):
        //Solo lo creamos si nadie lo ha creado antes.
        if(instanciaUnica == null){
            instanciaUnica =  new Presidente();
        }
        //Si ya existia, simplemente devolvemos el que ya teniamos .
        return instanciaUnica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
}
