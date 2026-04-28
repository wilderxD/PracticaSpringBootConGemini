package com.example.aprendo.aprendo.enum1;

public enum CodigoErrorApi {
    
    OK(200, "Solicitud realizada con exito"),
    NOT_FOUND(400, "No se encuentra el recurso soliictado"),
    UNAUTHORIZED(500, "No tiene autorizacion para esta solicitud"),
    SERVER_ERROR(401, "Error al intentar conectar con el servidor");
    
    private int codigoHttp;
    private String mensaje;
    
    private CodigoErrorApi(int codigo, String mensaje){
        this.codigoHttp = codigoHttp;
        this.mensaje = mensaje;
    }

    public int getCodigoHttp() {
        return codigoHttp;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    
}
