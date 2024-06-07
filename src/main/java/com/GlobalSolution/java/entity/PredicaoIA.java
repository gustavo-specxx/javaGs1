package com.GlobalSolution.java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_IA")
public class PredicaoIA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ia;
    private String dados;
    private String variaveis;
    private Integer predicoes;

    public PredicaoIA() {
    }

    public PredicaoIA(Integer id_ia, String dados, String variaveis, Integer predicoes) {
        this.id_ia = id_ia;
        this.dados = dados;
        this.variaveis = variaveis;
        this.predicoes = predicoes;
    }

    public Integer getId_ia() {
        return id_ia;
    }

    public void setId_ia(Integer id_ia) {
        this.id_ia = id_ia;
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public String getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(String variaveis) {
        this.variaveis = variaveis;
    }

    public Integer getPredicoes() {
        return predicoes;
    }

    public void setPredicoes(Integer predicoes) {
        this.predicoes = predicoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PredicaoIA that = (PredicaoIA) o;

        if (!id_ia.equals(that.id_ia)) return false;
        if (!dados.equals(that.dados)) return false;
        if (!variaveis.equals(that.variaveis)) return false;
        return predicoes.equals(that.predicoes);
    }

    @Override
    public int hashCode() {
        int result = id_ia.hashCode();
        result = 31 * result + dados.hashCode();
        result = 31 * result + variaveis.hashCode();
        result = 31 * result + predicoes.hashCode();
        return result;
    }
}
