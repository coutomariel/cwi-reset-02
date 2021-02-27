package br.com.cwi.reset.exemploreset.repository;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MensagemRepository {

    private List<Mensagem> mensagens;

    public MensagemRepository(List<Mensagem> mensagens) {
        this.mensagens = new ArrayList<>();
    }

    public Mensagem adicionarMensagem(Mensagem mensagem){
        this.mensagens.add(mensagem);
        return mensagem;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }
}
