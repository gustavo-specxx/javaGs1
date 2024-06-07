package com.GlobalSolution.java.service;


import com.GlobalSolution.java.entity.Usuario;
import com.GlobalSolution.java.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    // Injeção de dependência via construtor
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findById(Integer id) {
        return usuarioRepository.findById(id);
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario createUsuario(Usuario usuario) {
        // Presumindo que criar usuário pode envolver regras de negócio adicionais
        // antes de salvar no banco de dados
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Long id, Usuario usuario) {
        // Busca o usuário existente e atualiza com os novos dados recebidos
        return usuarioRepository.findById(id.intValue())
                .map(existingUser -> {
                    existingUser.setNomeUsuario(usuario.getNomeUsuario());
                    existingUser.setDataNascimentoUsuario(usuario.getDataNascimentoUsuario());
                    existingUser.setLocalizacaoUsuario(usuario.getLocalizacaoUsuario());
                    return usuarioRepository.save(existingUser);
                })
                .orElseGet(() -> {
                    // Se não existir, podemos decidir salvar como um novo usuário
                    // ou lançar uma exceção, dependendo da regra de negócio
                    usuario.setIdUsuario(id.intValue());
                    return usuarioRepository.save(usuario);
                });
    }

    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id.intValue());
    }
}
