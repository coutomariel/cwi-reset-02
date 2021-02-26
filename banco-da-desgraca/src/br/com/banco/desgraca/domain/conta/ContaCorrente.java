package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.ValorSaqueInvalidoException;

public class ContaCorrente extends Conta {

    private final Double TARIFA_TRANSFERENCIA_OUTRA_INSTITUICAO = 0.01;

    public ContaCorrente(Long numero, InstituicaoBancaria instituicaoBancaria, Double saldo) {
        super(numero, instituicaoBancaria, saldo);
    }

    @Override
    public void sacar(Double valor) {
        boolean ehMultiploDeCinco = (valor.intValue() % 5) == 0;
        if(ehMultiploDeCinco){
            super.sacar(valor);
        } else {
            throw new ValorSaqueInvalidoException("Valor de saque precisa ser divisível por 5.");
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        boolean transferenciaParaOutraInstituicao = !contaDestino.getInstituicaoBancaria().equals(this.getInstituicaoBancaria());
        double tarifa = 0.0;
        if(transferenciaParaOutraInstituicao){
            tarifa = valor * TARIFA_TRANSFERENCIA_OUTRA_INSTITUICAO;
            super.debitarTarifa(tarifa);
        }

        super.transferir(valor, contaDestino);

    }

    @Override
    public String toString() {
        return "Conta corrente " + super.toString();
    }



}
