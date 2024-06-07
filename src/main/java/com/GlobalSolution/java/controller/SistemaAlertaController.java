package com.GlobalSolution.java.controller;


import com.GlobalSolution.java.entity.SistemaAlerta;
import com.GlobalSolution.java.repository.SistemaAlertaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sistema-alertas")
@Tag(name = "Sistema de Alerta Controller", description = "Operações relacionadas ao sistema de alertas")
public class SistemaAlertaController {

    private final SistemaAlertaRepository sistemaAlertaRepository;

    public SistemaAlertaController(SistemaAlertaRepository sistemaAlertaRepository) {
        this.sistemaAlertaRepository = sistemaAlertaRepository;
    }

    @GetMapping
    @Operation(summary = "Listar todos os alertas em sua volta")
    public List<SistemaAlerta> listarAlertas() {
        return sistemaAlertaRepository.findAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtém um alerta pelo ID para mais detalhes")
    public ResponseEntity<SistemaAlerta> obterAlertaPorId(@PathVariable Integer id) {
        return sistemaAlertaRepository.findById(id)
                .map(alerta -> ResponseEntity.ok().body(alerta))
                .orElse(ResponseEntity.notFound().build());
    }
}
