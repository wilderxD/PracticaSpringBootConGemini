package com.example.aprendo.aprendo.SECURITY;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // seguridad web personalizada
public class SecurityConfig {
    
    //poniendolo en el contenedor de Spring para que pueda ser injectado por cualquier clase
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http
                .csrf(csrf -> csrf.disable())// desactivamos la proteccion de formularios web que no usan jwt
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))//le decimos al servidor qye olvide las sesiones STATELESS
                .authorizeHttpRequests(auth -> auth//configuramos que rutas dejamos abiertas y cuales no
                    .requestMatchers("/h2-console/**").permitAll()//dejamos abierta la BD H2 para pruebas
                    .requestMatchers("/api/auth/**").permitAll()//dejamos abierta la ruta a un login que crearemos a futuro
                    .anyRequest().authenticated()//Cualquier otra ruta exige estar autenticado
                );
        
        http.headers(headers -> headers.frameOptions(frame -> frame.disable()));//esta linea es importante par que se vea la base de datos H2 en el navegador
        
        return http.build();
    }
    
}
