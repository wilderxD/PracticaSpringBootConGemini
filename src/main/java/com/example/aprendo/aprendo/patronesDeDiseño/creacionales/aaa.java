
package com.example.aprendo.aprendo.patronesDeDiseño.creacionales;

import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.Computadora;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.ComputadoraBuilder;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.Factura;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.FacturaBuilder;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.Hamburguesa;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.HamburguesaBuilder;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.Sql;
import com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder.SqlBuilder;
import java.util.Date;


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
    
    public Factura facturaBuilder(){
        Factura f = new FacturaBuilder()
                .setNumeroF("tf01-2525")
                .setCliente("Wilder")
                .setFecha(new Date())
                .setMonto(15000.0)
                .setObservaciones("pago con visa")
                .clienteVip()
                .tieneDescuento()
                .tieneTarjeta()
                .build();
        
        return f;
    }
    
    public Hamburguesa hamburguesaBuilder(){
        return new HamburguesaBuilder().setNombre("hawaiana").setTamanio("Grande").salsa().cebolla().tomate().build();
    }    
    
    public Sql sqlBuilder(){
        Sql s = new SqlBuilder().select("nombre").from("empleados").where("id = 0").build();
        return s;
    }          
    
}
