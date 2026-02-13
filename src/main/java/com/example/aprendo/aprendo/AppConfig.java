package com.example.aprendo.aprendo;

import java.util.Scanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig { 
     
    @Bean
    public Scanner lector(){
        Scanner sc = new Scanner(System.in);
        
        return sc;
    }
}
