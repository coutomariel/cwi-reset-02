package exercicio.um;

import java.time.LocalDate;

public class Ator extends Pessoa{

    private Integer numeroOscars;

    public Ator(String nome, LocalDate dataNascimento, Integer numeroOscars, Genero genero) {
        super(nome, dataNascimento, genero);
        this.numeroOscars = numeroOscars;
    }

    @Override
    public void imprimirCredito() {
        System.out.println("Ator: " + super.getNome() + ", " + this.getNumeroOscars() + "oscars");
    }

    public Integer getNumeroOscars() {
        return numeroOscars;
    }

}
