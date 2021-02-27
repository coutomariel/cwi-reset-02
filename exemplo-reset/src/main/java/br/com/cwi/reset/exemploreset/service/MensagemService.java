package br.com.cwi.reset.exemploreset.service;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import br.com.cwi.reset.exemploreset.exception.BadRequestException;
import br.com.cwi.reset.exemploreset.repository.MensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    public List<Mensagem> obterTodas(){
        return mensagemRepository.getMensagens();
    }

    public Mensagem salvar(Mensagem mensagem){
        if(mensagem.getMensagem() == null || mensagem.getAutor() == null){
            throw new BadRequestException("Todos os campos precisam ser enviados");
        }
        return mensagemRepository.adicionarMensagem(mensagem);
    }
}
