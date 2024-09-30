package com.franquicia_api.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="sucursales")
public class SucursalModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "franquicia_id")
    private FranquiciaModel franquicia;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    private List<ProductoModel> productos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductoModel> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoModel> productos) {
        this.productos = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public FranquiciaModel getFranquicia() {
        return franquicia;
    }

    public void setFranquicia(FranquiciaModel franquicia) {
        this.franquicia = franquicia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
