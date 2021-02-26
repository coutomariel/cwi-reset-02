package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.TipoContaNaoSuportadoException;
import br.com.banco.desgraca.exception.ValorSaqueInvalidoException;

public class ContaPoupanca extends Conta{

    private final Double VALOR_MINIMO_SAQUE = 50.0;

    private final Double TARIFA_SAQUE = 0.02;
    private final Double TARIFA_TRANSFERENCIA_OUTRA_INSTITUICAO = 0.01;
    private final Double TARIFA_TRANSFERENCIA_PROPRIA_INSTITUICAO = 0.005;

    public ContaPoupanca(Long numero, InstituicaoBancaria instituicaoBancaria, Double saldo) {
        super(numero, instituicaoBancaria, saldo);
        validaSeInstituicaoSuportaContaPoupanca(instituicaoBancaria);
    }

    private void validaSeInstituicaoSuportaContaPoupanca(InstituicaoBancaria instituicaoBancaria) {
        boolean contaPoupancaNaoSuportada = !instituicaoBancaria.isPermiteContaPoupanca();
        if(contaPoupancaNaoSuportada){
            throw new TipoContaNaoSuportadoException(instituicaoBancaria.getDescricao() + " não permite conta poupança.");
        }
    }

    @Override
    public String toString() {
        return "Conta poupança " + super.toString();
    }

    @Override
    public void sacar(Double valor) {
        double tarifa = valor * TARIFA_SAQUE;
        if(valor >= VALOR_MINIMO_SAQUE){
            super.sacar(valor);
            super.debitarTarifa(tarifa);
        } else {
            throw new ValorSaqueInvalidoException("O valor minimo para saques nessa conta é R$" + VALOR_MINIMO_SAQUE);
        }
    }

    @Override
    public void transferir(Double valor, ContaBancaria contaDestino) {
        boolean transferenciaParaPropriaInstituicao = contaDestino.getInstituicaoBancaria()
                    .equals(this.getInstituicaoBancaria());
        double tarifa;
        if(transferenciaParaPropriaInstituicao){
            tarifa = valor * TARIFA_TRANSFERENCIA_PROPRIA_INSTITUICAO;
        } else {
            tarifa = valor * TARIFA_TRANSFERENCIA_OUTRA_INSTITUICAO;
        }

        super.debitarTarifa(tarifa);
        super.transferir(valor , contaDestino);
    }

}
