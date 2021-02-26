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
         * Teste de abertura de conta corrente
         *
          */
        Conta contaCorrenteBradesco = new ContaCorrente(2L, InstituicaoBancaria.BRADESCO, 150.0);
        System.out.println("\nCriada " + contaCorrenteBradesco + " com saldo de R$" + contaCorrenteBradesco.consultarSaldo());
        contas.gravarConta(contaCorrenteBradesco);

        /**
         * Teste de tranferência para outra conta com taxa de 1%
         */
        contaCorrenteBradesco.transferir(50.0, contaDigitaNubank);
        contaCorrenteBradesco.exibirExtrato(LocalDate.of(2020,2, 5), LocalDate.now());
        contaDigitaNubank.exibirExtrato(LocalDate.of(2020,2, 5), LocalDate.now());;

//        Conta contaPoupancaNubank = new ContaPoupanca(2L, InstituicaoBancaria.NUBANK, 200.0);

//        Conta contaPoupancaItau = new ContaPoupanca(2L, InstituicaoBancaria.ITAU, 200.0);
//        System.out.println(contaPoupancaItau);
//        contas.gravarConta(contaPoupancaItau);
//        System.out.println("Saldo: " + contaPoupancaItau.consultarSaldo());
//
//        System.out.println(contas.obterTodas());
//        contaPoupancaItau.transferir(100.0, contaDigitaNubank);
//
//        System.out.println("\nSaldo origem após transfereência: " + contaPoupancaItau.consultarSaldo());
//        System.out.println("Saldo após transfereência: " + contaDigitaNubank.consultarSaldo());
//
//        contaDigitaNubank.depositar(300.0);
//        System.out.println("Pós depósito -> " + contaDigitaNubank);
//        contaDigitaNubank.exibirExtrato(LocalDate.now(), LocalDate.now());

    }
}
