package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class PruebaAdapter {
    
    public static void main(String[] args) {
        
        EnchufeEuropeo viejo = new EnchufeEuropeo();
        IEnchufeAmericano miCargador = new AdaptadorEuropeoAAmericano(viejo);
        
        miCargador.conectarPlano();
        
        //1
        SistemaCobroLegacy viejo1 = new SistemaCobroLegacy();
        IPagoModerno miCambio = new PagoAdapter(viejo1);
        miCambio.pagar(50);
        
        //2
        
        
    }
    
}
