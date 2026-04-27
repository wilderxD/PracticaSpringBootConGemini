package com.example.aprendo.aprendo.enum1;

public enum EstadoDespacho2 {
    
    //Las instancias llaman al contructor privado que crearemos abajo
    EN_ALMACEN("ALM_01", "Preparando en el almacen central."),
    EN_RUTA("RUT-02", "El camion esta en camino al destino."),
    ENTREGADO("OK-03", "Recepcion confirmada por el cliente."),
    DEVUELTO("REV-04", "Ingreso a logistica inversa por rechazo.");
    
    //Los atributos de cada estado
    private final String codigo;
    private final String descripcion;
    
    //El constructor (Siempre es privado en un ENUM como patron sigleton)
    private EstadoDespacho2(String codigo, String descripcion){
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public static EstadoDespacho2 buscarPorCodigo(String codigoBuscado){
        
        for(EstadoDespacho2 estado : EstadoDespacho2.values() ){
            if(estado.getCodigo().equals(codigoBuscado)){
                return estado;
            }
        }        
        throw new IllegalArgumentException("Codigo de despacho no reconocido: " + codigoBuscado);
    }
    
    //GETTER'S para leer los datos desde fuera

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
