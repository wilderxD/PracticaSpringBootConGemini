package com.example.aprendo.aprendo;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AprendoApplication implements CommandLineRunner{

    /*
    private ProductoRepository prepository;*/
    
    private static final Logger logger = LoggerFactory.getLogger(AprendoApplication.class);
    
	public static void main(String[] args) {
		SpringApplication.run(AprendoApplication.class, args);               
                
        }

    @Override
    public void run(String... args) throws Exception {
       /* Producto p1 = new Producto();
        p1.setNombre("Arroz");
        p1.setPrecio(3.5);
        
        Producto p2 = new Producto();
        p2.setNombre("azucar");
        p2.setPrecio(4.3);
        
        Producto p3 = new Producto();
        p3.setNombre("leche");
        p3.setPrecio(2.8);
        
        prepository.save(p2);
        prepository.save(p1);
        prepository.save(p3);
        
        List<Producto> productos = prepository.findByPrecioLessThan(4);
        
        for(Producto produc : productos){
            System.out.println(produc.getNombre() + ", " + produc.getPrecio());
        }*/
    }
}
