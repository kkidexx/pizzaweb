package com.piazzaweb.pizzaweb.repositorio;

import com.piazzaweb.pizzaweb.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}