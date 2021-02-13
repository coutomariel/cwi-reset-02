package exercicio.um;

public class Ator {

    private String nome;
    private Integer idade;
    private Integer numeroOscars;
    private Genero genero;

    public void apressentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Nome: " + this.idade);
        System.out.println("Nome: " + this.genero.getDescricao() + "\n");
    }

    public Ator(String nome, Integer idade, Integer numeroOscars, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.numeroOscars = numeroOscars;
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

    public Integer getNumeroOscars() {
        return numeroOscars;
    }

    public void setNumeroOscars(Integer numeroOscars) {
        this.numeroOscars = numeroOscars;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
