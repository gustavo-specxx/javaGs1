package com.GlobalSolution.java.repository;


import com.GlobalSolution.java.entity.PredicaoIA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PredicaoIARepository extends JpaRepository<PredicaoIA, Integer> {
    List<PredicaoIA> findByDados(String dados); // Ajuste conforme necessário
}
