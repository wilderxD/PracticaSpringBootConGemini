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
        
    }
    
}
