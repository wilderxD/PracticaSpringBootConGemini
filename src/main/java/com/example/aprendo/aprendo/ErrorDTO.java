package com.example.aprendo.aprendo;

import java.time.LocalDateTime;


public class ErrorDTO {
    private String mensaje;
    private String codigo;
    private LocalDateTime fecha;
    
    public ErrorDTO(String mensaje, String codigo){
        this.mensaje = mensaje;
        this.codigo = codigo;
        this.fecha = LocalDateTime.now();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    
    
}
