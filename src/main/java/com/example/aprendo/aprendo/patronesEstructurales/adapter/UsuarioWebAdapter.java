package com.example.aprendo.aprendo.patronesEstructurales.adapter;

import java.time.LocalDate;
import java.util.Date;

public class UsuarioWebAdapter implements IUsuarioWeb{
    
    private final UsuarioDB usuarioDB;

    public UsuarioWebAdapter(UsuarioDB usuarioDB) {
        this.usuarioDB = usuarioDB;
    }
    
    @Override
    public String getNombreCompleto() {
        return usuarioDB.getNombre() + " " + usuarioDB.getApellido();
    }

    @Override
    public int getEdad() {
        return (int)LocalDate.now().getYear() -  usuarioDB.getAnioNacimiento();
    }
    
    
    
}
