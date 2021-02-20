package exercicio.um;

public class Ator extends Pessoa{

    private Integer numeroOscars;

    public Ator(String nome, Integer idade, Integer numeroOscars, Genero genero) {
        super(nome, idade, genero);
        this.numeroOscars = numeroOscars;
    }

    @Override
    public void imprimirCredito() {
        System.out.println("Ator: " + super.getNome() + ", " + this.getNumeroOscars() + "oscars");
    }

    public Integer getNumeroOscars() {
        return numeroOscars;
    }

    public void setNumeroOscars(Integer numeroOscars) {
        this.numeroOscars = numeroOscars;
    }



}
