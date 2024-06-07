package com.GlobalSolution.java.service;


import com.GlobalSolution.java.entity.SistemaAlerta;
import com.GlobalSolution.java.repository.SistemaAlertaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemaAlertaService {
    private final SistemaAlertaRepository sistemaAlertaRepository;

    public SistemaAlertaService(SistemaAlertaRepository sistemaAlertaRepository) {
        this.sistemaAlertaRepository = sistemaAlertaRepository;
    }

    public List<SistemaAlerta> getAllAlertas() {
        return sistemaAlertaRepository.findAll();
    }
}
