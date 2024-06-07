package com.GlobalSolution.java.service;

import com.GlobalSolution.java.entity.Autentica;
import com.GlobalSolution.java.repository.AutenticaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticaService {

    @Autowired
    private AutenticaRepository autenticaRepository;

    public Autentica save(Autentica autentica) {
        // Armazenar a senha diretamente sem codificação (não recomendado para produção)
        return autenticaRepository.save(autentica);
    }

    public boolean changePassword(Long id, String novaSenha) {
        Optional<Autentica> autenticaOptional = autenticaRepository.findById(id);
        if (autenticaOptional.isPresent()) {
            Autentica autentica = autenticaOptional.get();
            autentica.setSenhaUsuario(novaSenha); // Senha não codificada
            autenticaRepository.save(autentica);
            return true;
        }
        return false;
    }

    public Optional<Autentica> findByEmail(String email) {
        return autenticaRepository.findByEmail(email);
    }

    public boolean verifyCredentials(String email, String senha) {
        Optional<Autentica> autenticaOptional = autenticaRepository.findByEmail(email);
        if (autenticaOptional.isPresent()) {
            Autentica autentica = autenticaOptional.get();
            // Comparação direta da senha (não recomendado para produção)
            return senha.equals(autentica.getSenhaUsuario());
        }
        return false;
    }
}
