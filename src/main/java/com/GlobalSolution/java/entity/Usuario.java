package com.GlobalSolution.java.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tb_usuarios_seq")
    @SequenceGenerator(name = "tb_usuarios_seq", sequenceName = "tb_usuarios_seq", allocationSize = 1)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "nome_usuario", length = 50, nullable = false)
    private String nomeUsuario;

    @Column(name = "data_nascimento_usuario")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentoUsuario;

    @Column(name = "localizacao_usuario", length = 100)
    private String localizacaoUsuario;

    // Getters e Setters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataNascimentoUsuario() {
        return dataNascimentoUsuario;
    }

    public void setDataNascimentoUsuario(Date dataNascimentoUsuario) {
        this.dataNascimentoUsuario = dataNascimentoUsuario;
    }

    public String getLocalizacaoUsuario() {
        return localizacaoUsuario;
    }

    public void setLocalizacaoUsuario(String localizacaoUsuario) {
        this.localizacaoUsuario = localizacaoUsuario;
    }
}