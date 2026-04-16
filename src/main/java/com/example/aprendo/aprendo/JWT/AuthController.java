package com.example.aprendo.aprendo.JWT;

import com.example.aprendo.aprendo.JwtResponseDTO;
import com.example.aprendo.aprendo.RefreshToken;
import com.example.aprendo.aprendo.RefreshTokenService;
import com.example.aprendo.aprendo.SECURITY.AuthRequest;
import com.example.aprendo.aprendo.SECURITY.AuthResponse;
import com.example.aprendo.aprendo.TokenRefreshRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtService jwtService;
    private final RefreshTokenService refreshTokenService;
    
    public AuthController(AuthenticationManager authenticationManager, UserDetailsService userDetailsService, JwtService jwtService, RefreshTokenService refreshTokenService){
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtService = jwtService;
        this.refreshTokenService = refreshTokenService;
    }
    
    @PostMapping("/login")
    public ResponseEntity<JwtResponseDTO> authenticateAndGetToken(@RequestBody AuthRequest authRequest){
        //valida las credenciales con srping security
        //si la contraseña es incorrecta, esto lansara una excepcion automaticamente (403 forbiden)
       Authentication authentication = authenticationManager.authenticate(
               new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword())
       );
       
       if(authentication.isAuthenticated()){
           //Si la clave es correcta, creamos ambos tokens
           String accessToken = jwtService.generateToken(authRequest.getEmail());
           RefreshToken refreshToken = refreshTokenService.crearRefreshToken(accessToken);
           //Devolvemos la caja con los 2 tokens al frontend
           return ResponseEntity.ok(new JwtResponseDTO(accessToken, refreshToken.getToken()));
       }else{
           throw new UsernameNotFoundException("Usuario o contraseña incorrectos");
       }
        
    }
    
    //La renovacion silenciosa 
    //recibe solo el Refresh Token. Si es valido, devulve un AccesToken fresquito
    @PostMapping("/refresh")
    public ResponseEntity<JwtResponseDTO> refreshToken(@RequestBody TokenRefreshRequestDTO request){
        
        String requestRefreshToken = request.getRefreshToken();
        
        return refreshTokenService.buscarToken(requestRefreshToken)
                .map(refreshTokenService::verificarToken)
                .map(RefreshToken::getUsuario)
                .map(usuario -> {
                    //Si el Refresh Token existe y no a expirado, le damos un nuevo Access Token
                    String nuevoAccessToken = jwtService.generateToken(usuario.getEmail());//Asumiendo que getEmail() devulve el username
                    //Devolvemos el nuevo Access Token, mantenimiento el mismo RefreshToken
                    return ResponseEntity.ok(new JwtResponseDTO(nuevoAccessToken, requestRefreshToken));
                }).orElseThrow(() -> new RuntimeException("El refresh Token no existe en la base de datos"));
        
    }
    
}
