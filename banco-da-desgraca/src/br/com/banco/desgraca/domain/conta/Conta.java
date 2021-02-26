package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.Data;
import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.TipoTransacao;
import br.com.banco.desgraca.domain.Transacao;
import br.com.banco.desgraca.exception.SaldoInsuficienteException;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements ContaBancaria{

    private Long numero;
    private InstituicaoBancaria instituicaoBancaria;
    private Double saldo;
    private List<Transacao> transacoes;

    public Conta(Long numero, InstituicaoBancaria instituicaoBancaria, Double saldo) {
        this.numero = numero;
        this.instituicaoBancaria = instituicaoBancaria;
        this.saldo = saldo;
        this.transacoes = new ArrayList<>();
    }

    public InstituicaoBancaria getInstituicaoBancaria() {
        return instituicaoBancaria;
    }

    @Override
    public Double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public void depositar(Double valor) {
        Transacao transacao = new Transacao(TipoTransacao.CREDITO, Data.getDataTransacao(), valor);
        creditar(transacao);
        System.out.println("Depositando R$" + getFormatDecimalValue(valor) + " na " + toString());
    }

    private void creditar(Transacao transacao){
        this.saldo = saldo += transacao.getValor();
        this.transacoes.add(transacao);
    }

    @Override
    public void sacar(Double valor) {
        Transacao debito = new Transacao(TipoTransacao.DEBITO, Data.getDataTransacao(), valor);
        debitar(debito);
        System.out.println("Sacando R$" + getFormatDecimalValue(valor) + " da " + toString());
    }

    public void debitarTarifa(Double valor){
        Transacao debito = new Transacao(TipoTransacao.DEBITO, Data.getDataTransacao(), valor);
        debitar(debito);
        System.out.println("Debitando tarifa R$" + getFormatDecimalValue(valor) + " da " + toString());
    }

    private void debitar(Transacao transacao){
        if(this.saldo >= transacao.getValor()){
            this.saldo = saldo - transacao.getValor();
            this.transacoes.add(transacao);
        } else {
            throw new SaldoInsuficienteException("Saldo insufuciente para executar esta operação.");
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        System.out.println("Transferindo valor de R$" + getFormatDecimalValue(valor) + " da "
                + this.toString() + " para " + contaDestino.toString());

        Transacao debito = new Transacao(TipoTransacao.DEBITO, Data.getDataTransacao(), valor);
        this.debitar(debito);
//        Transacao credito = new Transacao(TipoTransacao.CREDITO, debito.getDataTransacao(), valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void exibirExtrato(LocalDate inicio, LocalDate fim) {
        System.out.println("\nExtrato de "+ toString());
        System.out.println(inicio + " a " + fim + ":");
        for(Transacao transacao: this.transacoes){
            boolean dentroDoPeriodoSolicitado = transacao.getDataTransacao().isAfter(inicio) && transacao
                    .getDataTransacao().isBefore(fim);

            if (dentroDoPeriodoSolicitado){
                System.out.println(transacao);
            }

        }
    }



    private String getFormatDecimalValue(Double valor) {
        return DecimalFormat.getCurrencyInstance().format(valor);
    }

    @Override
    public String toString() {
        return this.instituicaoBancaria.getDescricao() + " " + this.numero ;
    }

}
