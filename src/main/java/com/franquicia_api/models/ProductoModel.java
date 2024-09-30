package com.franquicia_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private int stock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public SucursalModel getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalModel sucursal) {
        this.sucursal = sucursal;
    }

    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private SucursalModel sucursal;
}
