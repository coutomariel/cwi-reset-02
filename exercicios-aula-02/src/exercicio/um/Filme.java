package exercicio.um;

import java.util.List;

public class Filme {

    private String nome;
    private String descricao;
    private Integer duracao;
    private Integer anoLancamento;

    private Integer avaliacao;

    private Diretor diretor;

    private List<Pessoa> elenco;

    public void exibirCreditos(){
        System.out.println("Créditos....");
//        this.elenco.forEach(pessoa -> System.out.println(pessoa.getNome()));
        for (Pessoa p : this.elenco){
            p.imprimirCredito();
        }
        System.out.println("The end...\n");
    }


    public void reproduzir(){
        System.out.println("Filme: \nNome: " + this.nome + " -Descrição: " + this.descricao + " -Duração: " + this.duracao
                + " -Dirigido por: " + this.diretor.getNome() + "\n") ;
    }

    public Filme(String nome, String descricao, Integer duracao, Integer anoLancamento, Integer avaliacao, Diretor diretor, List<Pessoa> elenco) {
        validaAvaliacao(avaliacao);
        validaDescricao(avaliacao);
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
        this.diretor = diretor;
        this.elenco = elenco;
    }

    private void validaDescricao(Integer avaliacao) {
        if("Batman vs Superman".equals(this.descricao)){
            this.avaliacao = 1;
        } else if("O Clube da Luta".equals(descricao)){
            this.avaliacao = 5;
        }
    }

    private void validaAvaliacao(Integer avaliacao) {
        if(avaliacao > 5 || avaliacao < 0){
            this.avaliacao = avaliacao;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Integer avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracao=" + duracao +
                ", anoLancamento=" + anoLancamento +
                ", avaliacao=" + avaliacao +
                ", diretor=" + diretor +
                '}';
    }
}
