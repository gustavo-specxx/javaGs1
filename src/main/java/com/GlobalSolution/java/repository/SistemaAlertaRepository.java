package com.GlobalSolution.java.repository;

import com.GlobalSolution.java.entity.SistemaAlerta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SistemaAlertaRepository extends JpaRepository<SistemaAlerta, Integer> {
    List<SistemaAlerta> findByTipoAlerta(Integer tipoAlerta);
}
