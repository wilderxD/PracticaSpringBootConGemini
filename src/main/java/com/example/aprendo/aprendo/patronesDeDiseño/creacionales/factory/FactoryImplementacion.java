package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.factory;

public class FactoryImplementacion {

    public static void main(String[] args) {
        //Ejercicio 1
        TipoTransporte tipo = TipoTransporte.MARITIMO;
        ITransporte miTransporte = TransporteFactory.crearTransporte(tipo);
        miTransporte.entregar();
        
        //Ejercicio 2
        FormatoExportacion fExportacion = FormatoExportacion.EXCEL;
        IExportador miExportacion = ExportadorFactory.crearExportador(fExportacion);
        miExportacion.exportar("todo va ah estar bien");
        
        //Ejercicio 3
        CanalNotificacion notificacion = CanalNotificacion.EMAIL;
        INotificacion miNotificacion = NotificacionFactory.crearNotificacion(notificacion);
        miNotificacion.enviar("Esto es urgente, responde!");
        
        //Ejercicio 4
        TipoArma seleccion = TipoArma.ESPADA;
        IArma miespada = ArmeriaFactory.crearArma(seleccion);
        System.out.println(miespada.hacerDanio());
        
        //Ejercicio 5
        TipoPago seleccion1 = TipoPago.PAYPAL;
        IPago mipago = PagoFactory.crearPago(seleccion1, "wilder@sdadkas.com");
        System.out.println("eL PAGO FUE ACEPTADO: " + mipago);
        
        //Ejercicio 6
        IEnemigo ie = EnemigoFactory.crearEnemigoAleatorio();
        System.out.println("Aparecio un enemigo: " );
        ie.gritar();
        
        //Ejercicio 7
        Computadora compu = ComputadoraFactory.crearPcGamer();
        System.out.println("Esta computadora tiene: " + compu.getRam() + " de memoria ram y tiene tarjetagrafica:" + compu.isTieneGrafica() );
        
        //Ejercicio 8
        
        
    }
    
}
