package com.example.aprendo.aprendo;

import com.example.aprendo.aprendo.SECURITY.UsuarioRepository;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
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
        RefreshToken refreshToken = new RefreshToken();
        
        //buscamos al usuario
        refreshToken.setUsuario(usuarioRepository.findByEmail(username).get());
        //generamos un texto largo aleatorio y unico
        refreshToken.setToken(UUID.randomUUID().toString());
        //Caduca en 7 dias (milisegundos)
        refreshToken.setExpiryDate(Instant.now().plusMillis(604800000));
        
        return tokenRepository.save(refreshToken);        
    }
    
    //Buscar Token
    public Optional<RefreshToken> buscarToken(String token){
        
        return tokenRepository.findByToken(token);
    }
    
    //Verificar si ya expiro
    public RefreshToken verificarToken(RefreshToken token){
        //Si la fecha actural es Mayor a la fecha de expiracion del token
        if(token.getExpiryDate().compareTo(Instant.now()) < 0){
            tokenRepository.delete(token); //Lo borramos de la BD porque ya no lo nesecitamos
            throw new RuntimeException("El refreshToken a expirado. Por favor, inicie sesion nuevamente.");
        }
        return token;
    }
           
    
}
