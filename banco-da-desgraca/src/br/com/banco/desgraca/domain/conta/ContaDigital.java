package br.com.banco.desgraca.domain.conta;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.exception.TipoContaNaoSuportadoException;
import br.com.banco.desgraca.exception.ValorSaqueInvalidoException;

public class ContaDigital extends Conta {

    private final double VALOR_MINIMO_SAQUE = 10.0;

    public ContaDigital(Long numero, InstituicaoBancaria instituicaoBancaria, Double saldo) {
        super(numero, instituicaoBancaria, saldo);
        validaSeInstituicaoSuportaContaDigital(instituicaoBancaria);
    }

    private void validaSeInstituicaoSuportaContaDigital(InstituicaoBancaria instituicaoBancaria) {
        boolean contaDigitalNaoSuportada = !instituicaoBancaria.isPermiteContaDigital();
        if (contaDigitalNaoSuportada){
            throw new TipoContaNaoSuportadoException(instituicaoBancaria.getDescricao() + " não permite conta digital");
        }
    }

    @Override
    public String toString() {
        return "Conta digital " + super.toString();
    }

    @Override
    public void sacar(Double valor) {
        if(valor >= VALOR_MINIMO_SAQUE){
            super.sacar(valor);
        } else {
            throw new ValorSaqueInvalidoException("Valor minimo permitido para saque é de R$" + VALOR_MINIMO_SAQUE);
        }
    }
}