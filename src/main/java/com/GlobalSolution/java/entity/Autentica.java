package com.GlobalSolution.java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_autentica")
public class Autentica {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_autentica_seq")
    @SequenceGenerator(name = "tb_autentica_seq", sequenceName = "tb_autentica_seq", allocationSize = 1)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "senha_usuario", nullable = false)
    private String senhaUsuario;

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
}
