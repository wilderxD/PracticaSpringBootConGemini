package com.example.aprendo.aprendo.JWT;

import com.example.aprendo.aprendo.SECURITY.AuthRequest;
import com.example.aprendo.aprendo.SECURITY.AuthResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
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
    
    public AuthController(AuthenticationManager authenticationManager, UserDetailsService userDetailsService, JwtService jwtService){
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtService = jwtService;
    }
    
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request){
        //valida las credenciales con srping security
        //si la contraseña es incorrecta, esto lansara una excepcion automaticamente (403 forbiden)
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );
        
        //si paso la linea anterior, las credenciales son validas. buscamos al usuario
        UserDetails userdetails = userDetailsService.loadUserByUsername(request.getEmail());
        
        //generamos el token
        String jwtToken = jwtService.generateToken(userdetails);
        
        //Devolvemos el token en el TDO de respuesta
        return ResponseEntity.ok(new AuthResponse(jwtToken));
        
    }
    
}
