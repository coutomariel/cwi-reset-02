package br.com.banco.desgraca.exception;

public class TipoContaNaoSuportadoException extends RuntimeException{
    public TipoContaNaoSuportadoException(String mensagemErro) {
        super(mensagemErro);
    }
}
