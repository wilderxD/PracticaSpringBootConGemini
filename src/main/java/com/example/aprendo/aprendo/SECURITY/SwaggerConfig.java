package com.example.aprendo.aprendo.SECURITY;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//definimos el esquema de seguridad(Token tipo Bearer)
@SecurityScheme(
        name = "Bearer Authentication",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SwaggerConfig {
    
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                //Le damos un titulo a la documentacion
                .info(new Info()
                        .title("APIRest - Wilder")
                        .version("1.0")
                        .description("Descripcion de mi Api segura con JWT - y documetnada con Swagger"))
                //Le decimos a Swagger que aplique el candado  a todas  las rutas  por defecto
                .addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"));
                
    }
}
