package exercicio.um;

public class Diretor {

    private String nome;
    private Integer idade;
    private Integer quantidadeFilmesDirigidos;
    private Genero genero;

    public void apressentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.idade);
        System.out.println("Nome: " + this.genero.getDescricao() + "\n");
    }

    public Diretor(String nome, Integer idade, Integer quantidadeFilmesDirigidos, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeFilmesDirigidos = quantidadeFilmesDirigidos;
        this.genero = genero;
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
    public Genero getGenero() {
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", quantidadeFilmesDirigidos=" + quantidadeFilmesDirigidos +
                ", genero=" + genero +
                '}';
    }
}
