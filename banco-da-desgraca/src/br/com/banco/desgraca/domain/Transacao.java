package br.com.banco.desgraca.domain;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private TipoTransacao tipoTransacao;
    private LocalDate dataTransacao;
    private Double valor;

    public Transacao(TipoTransacao tipoTransacao, LocalDate dataTransacao, Double valor) {
        this.tipoTransacao = tipoTransacao;
        this.dataTransacao = dataTransacao;
        this.valor = valor;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public LocalDate getDataTransacao() {
        return this.dataTransacao;
    }

    public Double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dataTransacao.format(formatter) + " - " + this.getTipoTransacao().getDescricao()
                + " - " + DecimalFormat.getCurrencyInstance().format(this.valor);
    }
}
