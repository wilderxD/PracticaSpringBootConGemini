package com.example.aprendo.aprendo.SECURITY;

import java.util.Collections;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
    private final UsuarioRepository usuarioRepository;
    
    public UserDetailsServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //el metodo que spring llama cada que alguien quiere hacer login
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //Buscamos al usuario en la BD
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con email: " + email));
        
        //Lo traduciomos al objeto user que entiende Spring security
        return new User(
                usuario.getEmail(),
                usuario.getPassword(), //la contraseña encriptada
                Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + usuario.getRol()))//le damos un rol
        );
    }
    
}
