package exercicio.um;

public class Diretor extends Pessoa{

    private Integer quantidadeFilmesDirigidos;

    public Diretor(String nome, Integer idade, Integer quantidadeFilmesDirigidos, Genero genero) {
        super(nome, idade, genero);
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public Integer getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }

    public void setQuantidadeFilmesDirigidos(Integer quantidadeFilmesDirigidos) {
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    @Override
    public void imprimirCredito() {
        System.out.println("Ator: " + super.getNome() + ", " + this.quantidadeFilmesDirigidos + "filmes dirigidos");
    }
}
