package com.piazzaweb.pizzaweb.modelo;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto {
    @Id
    private Long id;

    private String nombre;
    private Double precio;
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
}