package com.example.aprendo.aprendo;

import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
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
}

