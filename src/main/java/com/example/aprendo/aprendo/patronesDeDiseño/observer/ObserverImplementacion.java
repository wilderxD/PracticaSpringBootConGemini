package com.example.aprendo.aprendo.patronesDeDiseño.observer;

public class ObserverImplementacion {

    public static void main(String[] args) {
        
        TiendaForli tienda = new TiendaForli();        
        IObservador email = new ModuloEmail();        
        IObservador logistica = new ModuloLogistica();
        
        tienda.suscribir(email);
        tienda.suscribir(logistica);
        
        tienda.lanzarNuevaPromocion("¡2X1 en todod Almohadas..");
        
        
        CanalYoutube canal = new CanalYoutube("PRogramando en Java");
        IObservador user1 = new UsuarioAplicacion("Wilder");
        IObservador user2 = new UsuarioAplicacion("Sammir");
        IObservador user3 = new UsuarioAplicacion("Mariafe");
        
        canal.suscribir(user3);
        canal.suscribir(user1);
        canal.suscribir(user2);
        
        canal.subirVideo("Los mejores algoritmos para aprender arquitectura de software.");
        
        SensorHumo humo = new SensorHumo();
        IObservador detec1 = new RociadorAgua();
        IObservador detec2 = new EstacionBomberos();
        
        humo.suscribir(detec1);
        humo.suscribir(detec2);
        
        humo.detectarHumo();
        
        Subastador sub1 = new Subastador();
        Postor postor1 = new Postor("Wilder");
        Postor postor2 = new Postor("Sammir");
        Postor postor3 = new Postor("Mariafe");
        
        sub1.suscribir(postor1);
        sub1.suscribir(postor2);
        sub1.suscribir(postor3);
        
        sub1.aceptarNuevaOferta(1500);
        
        //4
        Camion camion = new Camion("BAZ-911");
        TallerMecanico taller = new TallerMecanico();
        AdministracionLogistica admi = new AdministracionLogistica();
        
        camion.suscribir(admi);
        camion.suscribir(taller);
        
        camion.cambiarEstado("EN REPARACION");
        
        //5
        
        
        //6
        Servidor servidor = new Servidor("ESPERANDO JUGADORES");
        IJugador jugador1 = new ClienteJuego("wil1093");
        IJugador jugador2 = new ClienteJuego("samir02");
        
        servidor.suscribir(jugador1);
        servidor.suscribir(jugador2);
        
        servidor.cambiarEstado("EN JUEGO");
        
    }
    
}
