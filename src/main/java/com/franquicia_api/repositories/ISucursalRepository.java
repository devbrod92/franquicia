package com.franquicia_api.repositories;

import com.franquicia_api.models.SucursalModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISucursalRepository extends JpaRepository<SucursalModel, Long> {
}
