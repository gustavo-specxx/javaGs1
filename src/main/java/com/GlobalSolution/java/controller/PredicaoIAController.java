package com.GlobalSolution.java.controller;


import com.GlobalSolution.java.entity.PredicaoIA;
import com.GlobalSolution.java.service.PredicaoIAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/predicoes")
public class PredicaoIAController {

    @Autowired
    private PredicaoIAService predicaoIAService;

    @GetMapping("/{dados}")
    public List<PredicaoIA> getPredicoesByDados(@PathVariable String dados) {
        return predicaoIAService.getPredicoesByDados(dados); // Ajuste conforme necessário
    }
}
