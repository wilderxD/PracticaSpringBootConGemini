package com.example.aprendo.aprendo.enum1;

public class EnumImplementacion {
    
    public static void main(String[] args) {
        
        EstadoDespacho estado = EstadoDespacho.EN_RUTA;
        System.out.println(estado.name());
        
        System.out.println(EstadoDespacho.ENTREGADO.ordinal());
        
        for(EstadoDespacho e : EstadoDespacho.values()){
            System.out.println("Opciones Disponibles: " + e);
        }
        
        // ENUM AVANZADO!!
        EstadoDespacho2 miPedido = EstadoDespacho2.DEVUELTO;
        System.out.println("Codigo: " + miPedido.getCodigo());
        System.out.println("Motivo: " + miPedido.getDescripcion());
        
        procesarPaquete(EstadoDespacho2.ENTREGADO);
        
        //Apartado PRUEBAS EJERCICIO 1
        for(MetodoPago m : MetodoPago.values()){
            System.out.println(m);
        }
        
        //EJERCICIO 3
        if(RolUsuario.SUPERVISOR.ordinal() > 0){
            System.out.println("Acceso denegado a configuración");
        }else{
            System.out.println("Acceso concedido");
        }
        
        //EJERCICIO 4
        System.out.println("El verde dura: " + Semaforo.VERDE.getSegundosDuracion() + " segundos");
        
        //EJERCICIO 5
        double precio = 1000;
        System.out.println("El costo de esta prenda de ropa calculando descuentos es: " + (precio - (precio * CategoriaProducto.ROPA.getPorcentajeDescuento())));
        
        //EJERCICIO 6
        System.out.println("Codigo: " + CodigoErrorApi.NOT_FOUND.getCodigoHttp() + " " + CodigoErrorApi.NOT_FOUND.getMensaje());
        
        //EJERCICIO 7
        System.out.println("La moneda buscada es: " + Moneda.buscarPorSimbolo("S/."));
        
        //EJERCICIO 9
        System.out.println("Cual es el estado de este documento: " + EstadoDocumento.APROVADO.siguientePaso());
        
        
    }
    
    public static void sugerirAlmohadas(TamanioColchon medida){
        switch(medida){
            case UNA_PLAZA, PLAZA_Y_MEDIA:
                System.out.println("Le corresponde 1 almohada");
                break;
            case DOS_PLAZAS, QUEEN, KING:
                System.out.println("Le corresponde 2 almohada");
        }
    }
    
    public static void procesarPaquete(EstadoDespacho2 estado){
            
        switch(estado){
            case EN_ALMACEN: 
                System.out.println("Asignado a chofer y placa....");
                break;
            case EN_RUTA:
                System.out.println("Enviando SMS al cliente con el tiempo estimado de llegada");
                break;
            case DEVUELTO:
                System.out.println("Registrando penalidad y re-ingreso a inventario");
                break;
            case ENTREGADO:
                System.out.println("Cerrando orden de servicio y facturando...");
                break;
        }
            
    }
}
