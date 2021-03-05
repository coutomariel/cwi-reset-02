package br.com.cwi.resetflix.domain;

public enum Genero {

    ACAO("Ação"),
    AVENTURA("Aventura"),
    COMEDIA("Comédia"),
    DRAMA("Drama"),
    ROMANCE("Romance"),
    FICCAO_CIENTIFICA("Ficção cientifica"),
    TERROR("Terro");

    private String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
