package com.example.aprendo.aprendo.SECURITY;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class CargadorDatosIniciales implements CommandLineRunner{
    
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    
    public CargadorDatosIniciales(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder){
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
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
        }
    }
    
}
