package oo_exerc03;

public class Aluno {

    private String nome;
    private Double notaFinal;

    String getSituacao(){
        return this.notaFinal >= 7.0 ? "aprovado(a)" : "reprovado(a)";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Aluno(String nome, Double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }
}
