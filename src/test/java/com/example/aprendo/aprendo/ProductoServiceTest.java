package com.example.aprendo.aprendo;

import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.any;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductoServiceTest {

    @Mock
    private ProductoRepository repositorio;

    @InjectMocks
    private ProductoService servicio;

    @Test
    void obtenerPorId_DeberiaRetornarProducto_CuandoExiste() {
        Long idPrueba = 1L;
        Producto productoSimulado = new Producto();
        productoSimulado.setId(idPrueba);
        productoSimulado.setNombre("laptop");
        productoSimulado.setPrecio(2000.0);

        when(repositorio.findById(idPrueba)).thenReturn(Optional.of(productoSimulado));
        Producto resultado = servicio.obtenerPorId(idPrueba);

        assertNotNull(resultado);
        assertEquals("laptop", resultado.getNombre());
        assertEquals(2000.0, resultado.getPrecio());

        verify(repositorio, times(1)).findById(idPrueba);
    }

    @Test
    void obtenerPorId_DeberaLanzarExcepcion_CuandoNoExiste() {
        Long idNoExistente = 50L;

        when(repositorio.findById(idNoExistente)).thenReturn(Optional.empty());

        assertThrows(RecursoNoEncontradoException.class, () -> {
            servicio.obtenerPorId(idNoExistente);
        });

        verify(repositorio, times(1)).findById(idNoExistente);
    }
    
    @Test
    void guardar_DeberiaRetornarProducto_CuandoSeGuardaExitosamente(){
        Producto productoParaGuardar = new Producto();
        productoParaGuardar.setNombre("Mouse");
        
        Producto productoGuardado = new Producto();
        productoGuardado.setId(10L);
        productoGuardado.setNombre("Mouse");
        
        //cuando el repo guarde Cualquier producto , devuelve el productoGuardado.
        when(repositorio.save(any(Producto.class))).thenReturn(productoGuardado);
        
        Producto resultado = servicio.guardar(productoParaGuardar);
        
        assertNotNull(resultado.getId());
        assertEquals(10L, resultado.getId());        
    }
    
    @Test
    void eliminar_DeberiaLlamarAlRepositorio_CuandoSeEjecuta(){
        Long id = 5L;
        
        servicio.eliminar(id);
        
        verify(repositorio, times(1)).deleteById(id);
    }
    
    @Test
    void obtenerTodos_DeberiaRetornarLista(){
        //arranque crear datos para la simulacion
        Long id1 = 1L;
        Long id2 = 2L;
        
        Producto producto1 = new Producto();
        producto1.setId(id1);
        producto1.setNombre("Teclado");
        producto1.setPrecio(15.00);
        
        Producto producto2 = new Producto();
        producto2.setId(id2);
        producto2.setNombre("Mouse");
        producto2.setPrecio(8.00);
        
        List<Producto> productos = List.of(producto1, producto2);
        
        //entrenar el repositorio
        when(repositorio.findAll()).thenReturn(productos);
        
        //llamar al servicio
        List<Producto> productosEntrenado = servicio.obtenerTodos();
        assertNotNull(productosEntrenado);
        assertEquals(2, productosEntrenado.size());
    }
    
    @Test
    void actualizar_DeberiaActualizarCorrectamente(){
        Producto productoExistente = new Producto();
        productoExistente.setNombre("Teclado");
        productoExistente.setPrecio(15.00);
        
        Producto productoEditado = new Producto();
        productoEditado.setNombre("Mouse");
        productoEditado.setPrecio(15.00);
        
        when(repositorio.findById(1L)).thenReturn(Optional.of(productoExistente));
        when(repositorio.save(any(Producto.class))).thenReturn(productoEditado);
        
        Producto productoActualizado = servicio.actualizar(1L, productoEditado);
        assertEquals("Mouse", productoActualizado.getNombre());        
        assertEquals(15, productoActualizado.getPrecio());
    }
    
    @Test
    void actualizar_EnCasoFalle(){
        Producto productoEditado = new Producto();
        productoEditado.setNombre("Teclado");
        productoEditado.setPrecio(25.00);
        
        when(repositorio.findById(2L)).thenReturn(Optional.empty());
        
        assertThrows(RecursoNoEncontradoException.class, () -> {
            servicio.actualizar(2L, productoEditado);
        });
        
        verify(repositorio, never()).save(any(Producto.class));
        
    }
}

