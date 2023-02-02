package com.centrosconsumo.repository;

import com.centrosconsumo.model.CentrosConsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CentrosConsumoRepository extends JpaRepository<CentrosConsumo, Integer> {
    //List<CentrosConsumo> findByCategoriaId(String categoria_id);
}
