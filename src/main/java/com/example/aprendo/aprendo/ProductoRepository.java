package com.example.aprendo.aprendo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    //buscar productos donde el precio sea menor que
    List<Producto> findByPrecioLessThan(double precioMaximo);
}
