package com.piazzaweb.pizzaweb.modelo;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;



@Data
@Entity
public class Categoria {
    @Id
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Producto> productos;
}