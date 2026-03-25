package com.example.aprendo.aprendo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; // Para get(), post()
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; // Para status(), jsonPath()



@WebMvcTest(ProductoController.class)
public class ProductoControllerTest {
    
    @Autowired
    private MockMvc mockMvc; //POSTMAN INTERNO
    
    @MockBean
    private ProductoService servicio;//Mockeamos el servicio para sprint
    
    @MockBean
    private ProductoMapper mapper;//Mockeamos el mapper
    
    @Autowired
    private ObjectMapper objectMapper;//utilidad para convertir objetos a JSON
    
    @Test
    void obtenerTodos_DeberiaRetornarYStatus200() throws Exception{
        Producto producto = new Producto();
        producto.setId(1L);
        producto.setNombre("Monitor");

        ProductoDTO dto = new ProductoDTO();
        dto.setId(1L);
        dto.setNombre("Monitor");
                        
        when(servicio.obtenerTodos()).thenReturn(List.of(producto));
        when(mapper.toDTO(any(Producto.class))).thenReturn(dto);
        
        mockMvc.perform(get("/api/productos") // Hacemos la petición GET
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()) // Esperamos un 200 OK
                .andExpect(jsonPath("$[0].nombre").value("Monitor"));
    }
    
    @Test
    void guardar_DeberiaRetornar201_CuandoDatosSonValidos() throws Exception{
        ProductoDTO dtoEntrada = new ProductoDTO();
        dtoEntrada.setNombre("Teclado");
        dtoEntrada.setPrecio(50.0);
        
        Producto productoGuardado = new Producto();
        productoGuardado.setId(1L);
        productoGuardado.setNombre("Teclado");
        
        ProductoDTO dtoSalida = new ProductoDTO();
        dtoSalida.setId(1L);
        dtoSalida.setNombre("Teclado");
        
        when(mapper.toEntity(any())).thenReturn(new Producto());
        when(servicio.guardar(any())).thenReturn(productoGuardado);
        when(mapper.toDTO(any())).thenReturn(dtoSalida);
        
        mockMvc.perform(post("/api/productos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(dtoEntrada))) // Enviamos el JSON en el Body
                .andExpect(status().isCreated()) // Esperamos 201 Created
                .andExpect(jsonPath("$.id").value(1L));
    }
    
    @Test
    void guardar_DeberiaRetornar400_CuandoNombreEstaVacio() throws Exception{
        ProductoDTO dtoInvalido = new ProductoDTO();
        dtoInvalido.setNombre("");
        dtoInvalido.setPrecio(50.0);
        
        mockMvc.perform(post("/api/productos")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(dtoInvalido)))
                .andExpect(status().isBadRequest());
        
    }
    
    @Test
    void obtenerUno_DeberiaRetornar200_CuandoExiste()throws Exception{
        Producto producto = new Producto();
        producto.setId(1L);
        producto.setNombre("Monitor");
        
        ProductoDTO dto = new ProductoDTO();
        dto.setId(1L);
        dto.setNombre("Monitor");
        
        when(servicio.obtenerPorId(1L)).thenReturn(producto);
        when(mapper.toDTO(any(Producto.class))).thenReturn(dto);
        
        mockMvc.perform(get("/api/productos/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nombre").value("Monitor"));
    }
    
    @Test
    void obtenerUno_DeberiaRetornar404_CuandoNoExiste() throws Exception{
        
        when(servicio.obtenerPorId(99L)).thenThrow(new RecursoNoEncontradoException("No existe"));
        
        mockMvc.perform(get("/api/productos/{id}", 99L)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
    
    @Test
    void eliminar_DeberiaRetornar204()throws Exception{
        Producto prod = new Producto();
        prod.setId(1L);
        prod.setNombre("Tableta");
        
        mockMvc.perform(delete("/api/productos/{id}", 1L)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }
    
}
