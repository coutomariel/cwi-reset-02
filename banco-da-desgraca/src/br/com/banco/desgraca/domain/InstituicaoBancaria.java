package br.com.banco.desgraca.domain;

public enum InstituicaoBancaria {

    BANCO_DO_BRASIL("Banco do Brasil"),
    BRADESCO("Bradesco"),
    CAIXA("Caixa Econômica Federal"),
    ITAU("Itaú", true, true),
    NUBANK("Nubank", true, false);

    private String descricao;
    private boolean permiteContaDigital;
    private boolean permiteContaPoupanca;


    InstituicaoBancaria(String descricao) {
        this.descricao = descricao;
        this.permiteContaDigital = false;
        this.permiteContaPoupanca = true;
    }

    InstituicaoBancaria(String descricao, boolean permiteContaDigital, boolean permiteContaPoupanca) {
        this.descricao = descricao;
        this.permiteContaDigital = permiteContaDigital;
        this.permiteContaPoupanca = permiteContaPoupanca;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isPermiteContaDigital() {
        return permiteContaDigital;
    }

    public boolean isPermiteContaPoupanca() {
        return permiteContaPoupanca;
    }
}
