package com.GlobalSolution.java.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_SISTEMA_ALERTA")
public class SistemaAlerta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sistema")
    private Integer idSistema;

    @Column(name = "id_sensor")
    private Integer idSensor;

    @Column(name = "tipo_alerta")
    private Integer tipoAlerta;

    @Column(name = "descricao_alerta", length = 500)
    private String descricaoAlerta;

    @Column(name = "data_hora_alerta")
    private LocalDateTime dataHoraAlerta;

    @Column(name = "nivel_alerta")
    private Integer nivelAlerta;

    // Getters e Setters
    public Integer getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Integer idSistema) {
        this.idSistema = idSistema;
    }

    public Integer getIdSensor() {
        return idSensor;
    }

    public void setIdSensor(Integer idSensor) {
        this.idSensor = idSensor;
    }

    public Integer getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(Integer tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    public String getDescricaoAlerta() {
        return descricaoAlerta;
    }

    public void setDescricaoAlerta(String descricaoAlerta) {
        this.descricaoAlerta = descricaoAlerta;
    }

    public LocalDateTime getDataHoraAlerta() {
        return dataHoraAlerta;
    }

    public void setDataHoraAlerta(LocalDateTime dataHoraAlerta) {
        this.dataHoraAlerta = dataHoraAlerta;
    }

    public Integer getNivelAlerta() {
        return nivelAlerta;
    }

    public void setNivelAlerta(Integer nivelAlerta) {
        this.nivelAlerta = nivelAlerta;
    }
}
