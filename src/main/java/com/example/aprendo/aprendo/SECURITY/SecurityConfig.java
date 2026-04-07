package com.example.aprendo.aprendo.SECURITY;

import com.example.aprendo.aprendo.JWT.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity // seguridad web personalizada
@EnableMethodSecurity
public class SecurityConfig {
    
    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final UserDetailsService userDetailsService;
    
    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFilter, UserDetailsService userDetailsService){
        this.jwtAuthenticationFilter = jwtAuthenticationFilter;
        this.userDetailsService = userDetailsService;
    }
    

    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)throws Exception{
        http
                .csrf(csrf -> csrf.disable())// desactivamos la proteccion de formularios web que no usan jwt
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))//le decimos al servidor qye olvide las sesiones STATELESS
                .authorizeHttpRequests(auth -> auth//configuramos que rutas dejamos abiertas y cuales no
                    .requestMatchers("/h2-console/**").permitAll()//dejamos abierta la BD H2 para pruebas
                    .requestMatchers("/api/auth/**").permitAll()//dejamos abierta la ruta a un login que crearemos a futuro
                    .anyRequest().authenticated())//Cualquier otra ruta exige estar autenticado
                .authenticationProvider(authenticationProvider())//agregamos nuestro proveedor de autenticacion
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);//ponemos nuestro filtro JWT antes que el de Sprint
                
        
        http.headers(headers -> headers.frameOptions(frame -> frame.disable()));//esta linea es importante par que se vea la base de datos H2 en el navegador
        
        return http.build();
    }
    
    //poniendolo en el contenedor de Spring para que pueda ser injectado por cualquier clase
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    //proveedor de autenticacion: une el UserDetailsService con el PAsswordEncoder
    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService);
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;        
    }
    
    //Gestor de autenticacion: se usa en el AuthController para iniciar sesion
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config)throws Exception{
        return config.getAuthenticationManager();
    }
    
    
}
