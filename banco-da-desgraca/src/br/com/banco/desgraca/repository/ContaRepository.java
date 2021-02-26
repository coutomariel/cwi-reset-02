package br.com.banco.desgraca.repository;

import br.com.banco.desgraca.domain.conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
    private List<Conta> contas;

    public ContaRepository() {
        this.contas = new ArrayList<>();
    }

    public List<Conta> obterTodas(){
        return this.contas;
    }

    public void gravarConta(Conta conta){
        this.contas.add(conta);
    }
}
