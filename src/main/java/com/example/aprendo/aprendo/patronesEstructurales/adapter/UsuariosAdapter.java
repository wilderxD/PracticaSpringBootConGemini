package com.example.aprendo.aprendo.patronesEstructurales.adapter;

import java.util.Arrays;
import java.util.List;

public class UsuariosAdapter implements IRepositorioUsuarios{
    
    BaseDeDatosAntigua bdAntigua;

    public UsuariosAdapter(BaseDeDatosAntigua bdAntigua) {
        this.bdAntigua = bdAntigua;
    }
    
    @Override
    public List<String> listarUsuarios() {        
        return Arrays.asList(bdAntigua.obtenerUsuarios());
    }
    
}
