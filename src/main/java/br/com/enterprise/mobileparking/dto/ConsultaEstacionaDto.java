package br.com.enterprise.mobileparking.dto;

import java.time.Duration;
import java.time.LocalDateTime;

public class ConsultaEstacionaDto {

    private String estacionamentoUsuarioId;
    private String usuarioId;
    private LocalDateTime inicio;
    private Duration tempoRestante;
    private Boolean expirado;

    public String getEstacionamentoUsuarioId() {
        return estacionamentoUsuarioId;
    }

    public void setEstacionamentoUsuarioId(String estacionamentoUsuarioId) {
        this.estacionamentoUsuarioId = estacionamentoUsuarioId;
    }

    public Duration getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(Duration tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public Boolean getExpirado() {
        return expirado;
    }

    public void setExpirado(Boolean expirado) {
        this.expirado = expirado;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }
}
