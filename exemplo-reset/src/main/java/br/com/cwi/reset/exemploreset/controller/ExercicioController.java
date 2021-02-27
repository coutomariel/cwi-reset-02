package br.com.cwi.reset.exemploreset.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nome")
public class ExercicioController {

    static String nome = "Jubileu";

    @GetMapping
    public String mostraNome(){
        return nome;
    }

    @PutMapping("/{novoNome}")
    public String alteraNome(@PathVariable("novoNome") String novoNome){
        this.nome = novoNome;
        return nome;
    }

    @GetMapping("/devtools")
    public String testeDevTolls(){
        return "DevTools funcionando";
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarNome(){
        this.nome = "";
    }
}
