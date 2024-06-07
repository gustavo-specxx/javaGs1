package com.GlobalSolution.java.service;


import com.GlobalSolution.java.entity.PredicaoIA;
import com.GlobalSolution.java.repository.PredicaoIARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredicaoIAService {

    @Autowired
    private PredicaoIARepository predicaoIARepository;

    public List<PredicaoIA> getPredicoesByDados(String dados) {
        return predicaoIARepository.findByDados(dados); // Ajuste conforme necessário
    }
}
