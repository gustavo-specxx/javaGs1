package com.GlobalSolution.java.repository;


import com.GlobalSolution.java.entity.Autentica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AutenticaRepository extends JpaRepository<Autentica, Long> {
    Optional<Autentica> findByEmail(String email);
}
