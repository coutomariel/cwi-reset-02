package br.com.banco.desgraca;

import br.com.banco.desgraca.domain.InstituicaoBancaria;
import br.com.banco.desgraca.domain.conta.Conta;
import br.com.banco.desgraca.domain.conta.ContaCorrente;
import br.com.banco.desgraca.domain.conta.ContaDigital;
import br.com.banco.desgraca.domain.conta.ContaPoupanca;
import br.com.banco.desgraca.repository.ContaRepository;

import java.time.LocalDate;

public class BancoDaDesgraca {

    public static void main(String[] args) {

        ContaRepository contas = new ContaRepository();

        /**
         * Testando criação de conta digital em banco sem suporte para o tipo de conta.
         *
         * Exception in thread "main" br.com.banco.desgraca.exception.
         * TipoContaNaoSuportadoException: Banco do Brasil não permite conta digital
         */

//        Conta contaDigitaBancoDoBrasil = new ContaDigital(1L, InstituicaoBancaria.BANCO_DO_BRASIL, 150.0);

        /**
         * Testando criação de conta digital em banco com suporte para o tipo de conta e suas operações básicas
         */
        Conta contaDigitaNubank = new ContaDigital(1L, InstituicaoBancaria.NUBANK, 150.0);
        System.out.println("Criada " + contaDigitaNubank + " com saldo de R$" + contaDigitaNubank.consultarSaldo());
        contas.gravarConta(contaDigitaNubank);

        contaDigitaNubank.depositar(250.0);
        contaDigitaNubank.sacar(50.0);
        contaDigitaNubank.exibirExtrato(LocalDate.of(2020,2, 5), LocalDate.now());

        /**
         * Testando saque conta digital menor que R$10
         * Exception in thread "main" br.com.banco.desgraca.exception.ValorSaqueInvalidoException
         */
//        contaDigitaNubank.sacar(5.0);


        /**
         * Testando abertura de conta poupança em banco sem suporte para o tipo de conta
         */
//        Conta contaPoupancaNubank = new ContaPoupanca(1L, InstituicaoBancaria.NUBANK, 150.0);


        System.out.println("\n---------------------------------------------------------");
        /**
         * Testando abertura de conta poupança em banco que suporte este tipo de conta e suas operações básicas
         */
        Conta contaPoupancaItau = new ContaPoupanca(5L, InstituicaoBancaria.ITAU, 300.0);
        System.out.println("\nCriada " + contaPoupancaItau + " com saldo de R$" + contaPoupancaItau.consultarSaldo());
        contas.gravarConta(contaPoupancaItau);

        /**
         * Testando saque de conta poupança que deve aplicar tarifa de 2% sobre o mesmo
         */
        contaPoupancaItau.sacar(100.0);
        contaPoupancaItau.exibirExtrato(LocalDate.of(2020,2, 5), LocalDate.now());
        System.out.println("Saldo R$" + contaPoupancaItau.consultarSaldo());


        /**
         * Teste de abertura de conta corrente
         *
          */
        System.out.println("\n---------------------------------------------------------");
        Conta contaCorrenteBradesco = new ContaCorrente(2L, InstituicaoBancaria.BRADESCO, 150.0);
        System.out.println("\nCriada " + contaCorrenteBradesco + " com saldo de R$" + contaCorrenteBradesco.consultarSaldo());
        contas.gravarConta(contaCorrenteBradesco);

        /**
         * Teste de tranferência de conta corrente para outra conta com taxa de 1%
         */
        contaCorrenteBradesco.transferir(50.0, contaPoupancaItau);
        contaCorrenteBradesco.exibirExtrato(LocalDate.of(2020,2, 5), LocalDate.now());
        contaPoupancaItau.exibirExtrato(LocalDate.of(2020,2, 5), LocalDate.now());;

        /**
         * Teste de saque de conta corrente com valor não divisivel por 5
         *
         * Exception in thread "main"
         * br.com.banco.desgraca.exception.ValorSaqueInvalidoException:
         * Valor de saque precisa ser divisível por 5.
         */
//        contaCorrenteBradesco.sacar(12.0);
        System.out.println("\n");
        contaCorrenteBradesco.sacar(50.0);
        System.out.println("\n---------------------------------------------------------");


    }
}
