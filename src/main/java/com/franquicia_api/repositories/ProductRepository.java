package com.franquicia_api.repositories;


import com.franquicia_api.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findProductsWithMostStockByFranchise(@Param("franchiseId") Long franchiseId);
}

