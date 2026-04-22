package com.example.aprendo.aprendo.patronesDeDiseño.creacionales;

import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.CacheMemoria;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.ColaImpresion;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.ConexionBD;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.ConfiguracionGlobal;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.Logger;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.PreferenciasApp;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.SesionActual;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.singleton.Usuario;

public class SingletonPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConfiguracionGlobal config1 = ConfiguracionGlobal.getInstance();
        config1.setTema("Oscuro");
    
        ConfiguracionGlobal config2 = ConfiguracionGlobal.getInstance();
        System.out.println(config2.getTema());
        
        Logger logger1 = Logger.getInstance();
        logger1.escribirLog("Falla del sistema!!");
        
        
        Logger logger2 = Logger.getInstance();
        logger2.escribirLog("Nuevamente en lines");
        
        ConexionBD con1 = ConexionBD.getInstance();
        con1.conectar();
        System.out.println(con1.getEstado());
        
        ConexionBD con2 = ConexionBD.getInstance();
        con2.Desconectar();
        System.out.println(con1.getEstado());
        
        PreferenciasApp pa = PreferenciasApp.getInstance();
        pa.setVolumen(55);
        pa.setIdioma("Ingles");
        
        PreferenciasApp pa2 = PreferenciasApp.getInstance();
        System.out.println("tienes un Volumen en: " + pa2.getVolumen() + " y el idioma: " + pa2.getIdioma());
        
        ColaImpresion im = ColaImpresion.getInstance();
        im.agregarTrabajo("impresion1");
        im.agregarTrabajo("impresion2");
        im.agregarTrabajo("impresion3");
        
        ColaImpresion im2 = ColaImpresion.getInstance();
        im2.imprimirSiguiente();
        
        CacheMemoria mem = CacheMemoria.getInstance();
        mem.guardarValor("crema", "shampoo");
        mem.guardarValor("jabones", "palmolive");
        
        CacheMemoria mem2 = CacheMemoria.getInstance();
        System.out.println(mem2.obtenerValor("crema"));
        
        SesionActual sa = SesionActual.getInstance();
        Usuario u = new Usuario();
        u.setNombre("wilder");        
        u.setRol("Administrador");
        sa.iniciarSesion(u);
        
        SesionActual sa2 = SesionActual.getInstance();
        System.out.println(sa2.getEstado());
        
        
        
    }
    
}
