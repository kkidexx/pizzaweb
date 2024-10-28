package com.piazzaweb.pizzaweb.serviciooo;

import com.piazzaweb.pizzaweb.modelo.Categoria;

import java.util.List;

public interface CategoriaService {
    List<Categoria> obtenerTodasCategorias();
    Categoria guardarCategoria(Categoria categoria);
    Categoria obtenerCategoriaPorId(Long id);
    void eliminarCategoria(Long id);
}