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
