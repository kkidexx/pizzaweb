package com.piazzaweb.pizzaweb.repositorio;

import com.piazzaweb.pizzaweb.modelo.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}