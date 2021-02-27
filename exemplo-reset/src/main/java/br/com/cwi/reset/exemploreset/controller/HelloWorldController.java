package br.com.cwi.reset.exemploreset.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    static String mensagem = "Hello World";

    @GetMapping
    public String helloWorld(){
        return mensagem;
    }

    @PutMapping("/{novaMensagem}")
    public String mudarMensagem(@PathVariable("novaMensagem") String novaMensagem){
        this.mensagem = novaMensagem;
        return this.mensagem;

    }
}
