package exercicio.um;

public class Diretor {

    private String nome;
    private Integer idade;
    private Integer quantidadeFilmesDirigidos;

    public Diretor(String nome, Integer idade, Integer quantidadeFilmesDirigidos) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getQuantidadeFilmesDirigidos() {
        return quantidadeFilmesDirigidos;
    }

    public void setQuantidadeFilmesDirigidos(Integer quantidadeFilmesDirigidos) {
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", quantidadeFilmesDirigidos=" + quantidadeFilmesDirigidos +
                '}';
    }
}
