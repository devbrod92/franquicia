package com.franquicia_api.repositories;


import com.franquicia_api.models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductoRepository extends JpaRepository<ProductoModel, Long> {
    List<ProductoModel> findBySucursalId(Long sucursalId);
}

