package br.com.cwi.reset.exemploreset.controller;

import br.com.cwi.reset.exemploreset.domain.Mensagem;
import br.com.cwi.reset.exemploreset.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private MensagemService mensagemService;

    @GetMapping
    public List<Mensagem> getMensagens(){
        return mensagemService.obterTodas();
    }

    @PostMapping
    public Mensagem create(@RequestBody Mensagem mensagem){
        return mensagemService.salvar(mensagem);
    }
}
