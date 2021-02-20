package exercicio.um;

import java.time.LocalDate;

public class Diretor extends Pessoa{

    private Integer quantidadeFilmesDirigidos;

    public Diretor(String nome, LocalDate dataNascimento, Integer quantidadeFilmesDirigidos, Genero genero) {
        super(nome, dataNascimento, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    @Override
    public void imprimirCredito() {
        System.out.println("Ator: " + super.getNome() + ", " + this.quantidadeFilmesDirigidos + "filmes dirigidos");
    }

    public Integer getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }
}
