package br.com.cwi.reset.exemploreset.domain;

public class Mensagem {

    private String mensagem;
    private String autor;

    public Mensagem(String mensagem, String autor) {
        this.mensagem = mensagem;
        this.autor = autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
