package com.example.aprendo.aprendo.patronesDeDiseño.estrunturales.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        //pedimos un cafe simple
        ICafe miCafe = new CafeSimple();
        //lo envolmemos en leche
        miCafe = new LecheDecorator(miCafe);
        
        System.out.println(miCafe.getDescripcion());
        System.out.println("Costo: S/" + miCafe.getCosto());
        
        //1
        String mensaje = "Hola a todos desde Java";
        INotificador miNotificacion = new NotificadorSMS();
        miNotificacion = new DecoradorWhatsApp(miNotificacion);
        miNotificacion = new DecoradorEmail(miNotificacion);
        
        miNotificacion.enviar(mensaje);
        
        //2
        ITexto texto = new TextoPlano("Hola desde Java");
        texto = new DecoradorNegrita(texto);
        texto = new DecoradorSubrayado(texto);
        
        System.out.println(texto.formatear());
        
        //3
        IVehiculo vehiculo = new CocheEstandar();
        vehiculo = new DecoradorAireAcondicionado(vehiculo);
        vehiculo = new DecoradorAsientosCuero(vehiculo);
        
        System.out.println(vehiculo.getEquipamiento());
        System.out.println(vehiculo.getPrecio());
        
        //4
        IPedido pedido = new PedidoColchon();
        pedido = new GarantiaExtendida(pedido);
        pedido = new EntregaProvincia(pedido);
        pedido = new EmpaquePremiun(pedido);
        
        System.out.println(pedido.obtenerDetalle());
        System.out.println("el costo total del colchon es: " + pedido.calcularTotal());
        
        //5
        IReporte reporte = new ReporteInventario();
        reporte = new DecoradorConfidencial(reporte);
        reporte = new DecoradorFirmaDigital(reporte);
        
        System.out.println(reporte.generar());
        
        //6
        IProcesadorDatos procesador = new ProcesarTextoBasico();
        procesador = new DecoradorMayusculas(procesador);
        procesador = new DecoradorSinEspacios(procesador);
        
        System.out.println(procesador.procesar("  Hola   Mundo   Desde   Java  "));
        
        
    }
    
}
