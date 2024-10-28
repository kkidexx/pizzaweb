package com.piazzaweb.pizzaweb.servicio.impl;

import com.piazzaweb.pizzaweb.modelo.Producto;
import com.piazzaweb.pizzaweb.repositorio.ProductoRepository;
import com.piazzaweb.pizzaweb.serviciooo.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> obtenerTodosProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}