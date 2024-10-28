package com.piazzaweb.pizzaweb.servicio.impl;

import com.piazzaweb.pizzaweb.modelo.Categoria;
import com.piazzaweb.pizzaweb.repositorio.CategoriaRepository;
import com.piazzaweb.pizzaweb.serviciooo.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> obtenerTodasCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria guardarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria obtenerCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}