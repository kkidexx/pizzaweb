package com.piazzaweb.pizzaweb.controlador;

import com.piazzaweb.pizzaweb.modelo.Categoria;
import com.piazzaweb.pizzaweb.serviciooo.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.obtenerTodasCategorias());
        return "categorias";
    }

    @GetMapping("/nuevo")
    public String mostrarFormularioCategoria(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria_form";
    }

    @PostMapping("/guardar")
    public String guardarCategoria(@ModelAttribute("categoria") Categoria categoria) {
        categoriaService.guardarCategoria(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Long id, Model model) {
        model.addAttribute("categoria", categoriaService.obtenerCategoriaPorId(id));
        return "categoria_form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable("id") Long id) {
        categoriaService.eliminarCategoria(id);
        return "redirect:/categorias";
    }
}