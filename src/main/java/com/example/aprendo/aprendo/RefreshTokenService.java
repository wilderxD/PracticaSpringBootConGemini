package com.example.aprendo.aprendo;

import com.example.aprendo.aprendo.SECURITY.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class RefreshTokenService {
    
    private final RefreshTokenRepository tokenRepository;
    private final UsuarioRepository usuarioRepository;
    
    public RefreshTokenService(RefreshTokenRepository tokenRepository, UsuarioRepository usuarioRepository){
        this.tokenRepository = tokenRepository;
        this.usuarioRepository = usuarioRepository;
    }
    
    //Crear un nuevo token para el usuario
    public RefreshToken crearRefreshToken(String username){
        
    }
           
    
}
