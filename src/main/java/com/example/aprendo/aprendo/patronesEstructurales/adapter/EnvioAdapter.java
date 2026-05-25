package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class EnvioAdapter implements IEnvioModerno{
    
    EnvioAntiguo envioA;

    public EnvioAdapter(EnvioAntiguo envioA) {
        this.envioA = envioA;
    }
    
    @Override
    public void despacharPaquete(String direccionCompleta) {
        System.out.println(direccionCompleta);
        String[] datos = direccionCompleta.split(",");
        envioA.procesarEnvio(datos[0], datos[1], datos[2]);
    }
    
}
