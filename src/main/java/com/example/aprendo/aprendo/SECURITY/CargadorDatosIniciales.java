package com.example.aprendo.aprendo.SECURITY;

import com.example.aprendo.aprendo.Producto;
import com.example.aprendo.aprendo.ProductoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CargadorDatosIniciales implements CommandLineRunner{
    
    private final UsuarioRepository usuarioRepository;
    private final ProductoRepository productoRepository;
    private final PasswordEncoder passwordEncoder;
    
    public CargadorDatosIniciales(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder, ProductoRepository productoRepository){
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(usuarioRepository.count() == 0){
            Usuario admin = new Usuario();
            admin.setEmail("wilder1093@gmail.com");
            admin.setPassword(passwordEncoder.encode("123"));
            admin.setRol("ADMIN");
            
            usuarioRepository.save(admin);
            System.out.println("Usuario administrador creado con exito");
            
            Usuario user = new Usuario();
            user.setEmail("user@gmail.com");
            user.setPassword(passwordEncoder.encode("123"));
            user.setRol("USER");
            
            usuarioRepository.save(user);
            
            Producto prod1 = new Producto();
            prod1.setNombre("Monitor");
            prod1.setPrecio(1500.0);
            
            productoRepository.save(prod1);
            
            Producto prod2 = new Producto();
            prod2.setNombre("Mouse");
            prod2.setPrecio(30.0);
            
            productoRepository.save(prod2);
        }
    }
    
}
