
package com.example.aprendo.aprendo.patronesDeDiseño.creacionales;

import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.Computadora;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.ComputadoraBuilder;


public class aaa {
    
    
    public Computadora construirBuilder(){
       Computadora comp1 = new ComputadoraBuilder()
                .setCpu("")
                .setRam(5)
                .conBluetooth()
                .agregamosGrafica("")
                .build();   
       
       return comp1;
    }
    
          
    
}
