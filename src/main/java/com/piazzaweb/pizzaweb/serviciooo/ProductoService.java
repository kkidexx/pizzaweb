package com.piazzaweb.pizzaweb.serviciooo;

import com.piazzaweb.pizzaweb.modelo.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> obtenerTodosProductos();
    Producto guardarProducto(Producto producto);
    Producto obtenerProductoPorId(Long id);
    void eliminarProducto(Long id);
}