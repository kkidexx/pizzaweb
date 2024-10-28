package com.piazzaweb.pizzaweb.controlador;

import com.piazzaweb.pizzaweb.modelo.Producto;
import com.piazzaweb.pizzaweb.serviciooo.CategoriaService;
import com.piazzaweb.pizzaweb.serviciooo.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.obtenerTodosProductos());
        return "productos";
    }
    @GetMapping("/nuevo")
    public String mostrarFormularioProducto(Model model) {
        model.addAttribute("producto", new Producto());
        model.addAttribute("categorias", categoriaService.obtenerTodasCategorias());
        return "producto_form";
    }


    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        productoService.guardarProducto(producto);
        return "redirect:/productos";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("producto", productoService.obtenerProductoPorId(id));
        model.addAttribute("categorias", categoriaService.obtenerTodasCategorias());
        return "producto_form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") Long id) {
        productoService.eliminarProducto(id);
        return "redirect:/productos";
    }
}