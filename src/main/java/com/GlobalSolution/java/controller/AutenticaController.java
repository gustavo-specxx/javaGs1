package com.GlobalSolution.java.controller;

import com.GlobalSolution.java.entity.Autentica;
import com.GlobalSolution.java.service.AutenticaService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/autentica")
public class AutenticaController {

    @Autowired
    private AutenticaService autenticaService;

    @PostMapping("/save")
    @Operation(summary = "Criar email e senha")
    public Autentica saveAutentica(@RequestBody Autentica autentica) {
        return autenticaService.save(autentica);
    }

    @PostMapping("/change-password")
    @Operation(summary = "Alterar senha")
    public ResponseEntity<String> changePassword(@RequestParam Long id, @RequestParam String novaSenha) {
        boolean updated = autenticaService.changePassword(id, novaSenha);
        if (updated) {
            return ResponseEntity.ok("Senha alterada com sucesso.");
        } else {
            return ResponseEntity.badRequest().body("Falha ao alterar a senha.");
        }
    }

    @PostMapping("/login")
    @Operation(summary = "Login do usuário")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String senha) {
        Optional<Autentica> autenticaOptional = autenticaService.findByEmail(email);
        if (autenticaOptional.isPresent()) {
            Autentica autentica = autenticaOptional.get();
            if (senha.equals(autentica.getSenhaUsuario())) { // Comparação direta da senha
                return ResponseEntity.ok("Login bem-sucedido.");
            }
        }
        return ResponseEntity.status(401).body("Email ou senha inválidos.");
    }
}
