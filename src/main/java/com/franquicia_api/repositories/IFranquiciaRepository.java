package com.franquicia_api.repositories;

import com.franquicia_api.models.FranquiciaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFranquiciaRepository extends JpaRepository<FranquiciaModel, Long> {
}
