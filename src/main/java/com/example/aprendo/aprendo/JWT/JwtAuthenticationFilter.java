package com.example.aprendo.aprendo.JWT;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter{
    
    private final JwtService jwtService;
    private final UserDetailsService userDetailsService;
    
    public JwtAuthenticationFilter(JwtService jwtService, UserDetailsService userDetailsService){
        this.jwtService = jwtService;
        this.userDetailsService = userDetailsService;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
   
        //Extrae la cabecera Authorization de la peticion
        final String authHeader = request.getHeader("Authorization");
        final String jwt;
        final String userEmail;
        
        //si no hay caebcera o no empieza con Bearer lo dejara pasar para que no haya interferencia con las rutas publicas 
        if(authHeader == null || !authHeader.startsWith("Bearer ")){
            filterChain.doFilter(request, response);
            return;
        }
        
        //Extraemos el Token quitando los 7 primeros caracteres: "Bearer "
        jwt = authHeader.substring(7);
        
        //Extraemos el email del Token usando la fabrica 
        userEmail = jwtService.extractUsername(jwt);
        
        //si hay email en el token y el usuario aun no esta autenticado en este hilo
        if(userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null){
            
            //buscamos al usuario en la BD
            UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
            
            //Validamos que el token sea correcto y no haya expirado
            if(jwtService.isTokenValid(jwt, userDetails)){
                
                //creamos el Pase Vip UserNamePAsswordAuthenticationToken
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails, 
                        null, //credenciales nulas ya que lo validamos con el token
                        userDetails.getAuthorities()); //los roles
                
                //guardamos los detalles de la peticion (IP, etc)
                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                
                //Lo dejamos pasar Gaurdamos el pase VIP en el contexto de seguridad de spring
                SecurityContextHolder.getContext().setAuthentication(authToken);                
            }
        }
        
        //continuamos con la cadena de filtros para que llegue al controller.
        filterChain.doFilter(request, response);        
    }    
}
