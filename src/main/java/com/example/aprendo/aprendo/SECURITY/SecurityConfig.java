package com.example.aprendo.aprendo.SECURITY;

import com.example.aprendo.aprendo.JWT.JwtAuthenticationFilter;
import java.util.Arrays;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
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
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


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
                .cors(cors -> cors.configurationSource(corsConfigurationSource()))//Le decimos a Spring que active Cors usando el metodo que crearemos mas abajo
                .csrf(csrf -> csrf.disable())// desactivamos la proteccion de formularios web que no usan jwt
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))//le decimos al servidor qye olvide las sesiones STATELESS
                .authorizeHttpRequests(auth -> auth//configuramos que rutas dejamos abiertas y cuales no
                    .requestMatchers("/h2-console/**").permitAll()//dejamos abierta la BD H2 para pruebas
                    .requestMatchers("/api/auth/**").permitAll()//dejamos abierta la ruta a un login que crearemos a futuro
                    .requestMatchers("/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll()//Permitir las rutas de swagger
                    .requestMatchers("/error").permitAll()
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
    
    //creamos el Bean con regals extactas del CORS
    @Bean
    CorsConfigurationSource corsConfigurationSource(){
        CorsConfiguration configuration = new CorsConfiguration();
        //Quien puede conectarse por ejemplo el puerto de Angular o React
        configuration.setAllowedOrigins(Arrays.asList("http://localhost:4200", "http://localhost:5173"));
        
        //Que vervos puede usar
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        
        //Que cabeceras puede enviar(Importatnte para que pueda enviar el Berarer en la cabecera)
        configuration.setAllowedHeaders(Arrays.asList("Authorization", "Content-Type"));
        
        //Permitimos el uso de credenciales/cookies
        configuration.setAllowCredentials(true);
        
        //Agregamos esta regla a todas las rutas de nuestra api(**)
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration );
        
        return source;
    }
    
    
}
