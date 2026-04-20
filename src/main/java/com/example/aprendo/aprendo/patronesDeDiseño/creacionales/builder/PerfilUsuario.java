package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class PerfilUsuario {
    private String username;
    private String biografia;
    private String fotoUrl;
    private boolean esCuentaPrivada;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public boolean isEsCuentaPrivada() {
        return esCuentaPrivada;
    }

    public void setEsCuentaPrivada(boolean esCuentaPrivada) {
        this.esCuentaPrivada = esCuentaPrivada;
    }
    
    
    
}
