package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ClienteJuego implements IJugador{

    private String gamertag;    

    public ClienteJuego(String gamertag) {
        this.gamertag = gamertag;
    }
    
    @Override
    public void actualizar(Servidor servidor) {
        System.out.println("El jugador: " + this.gamertag + " ve en su pantalla: " + servidor.getStadoJuego());
    }
    
}
