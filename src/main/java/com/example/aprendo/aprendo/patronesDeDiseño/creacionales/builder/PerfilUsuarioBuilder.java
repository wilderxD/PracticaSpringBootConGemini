package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class PerfilUsuarioBuilder {
    
    private PerfilUsuario pUsuario = new PerfilUsuario();
    
    public PerfilUsuarioBuilder setUsername(String username){
        
        this.pUsuario.setUsername(username);
        return this;
    }
    
    public PerfilUsuarioBuilder setBiografia(String biografia){
        
        this.pUsuario.setBiografia(biografia);
        return this;
    }
    
    public PerfilUsuarioBuilder setFotoUrl(String fotoUrl){
        
        this.pUsuario.setFotoUrl(fotoUrl);
        return this;
    }
    
    public PerfilUsuarioBuilder conCuentaPrivada(){
        this.pUsuario.setEsCuentaPrivada(true);
        return this;
    }
    
    public PerfilUsuario builder(){
        
        if(pUsuario.getUsername() == null){
            throw new RuntimeException("El perfil de usuario debe tener nombre de usuario.!");
        }
        
        return this.pUsuario;
    }
    
}
