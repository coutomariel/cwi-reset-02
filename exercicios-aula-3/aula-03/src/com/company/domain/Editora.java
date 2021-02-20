package com.company.domain;

import com.company.exceptions.EditoraException;

public class Editora {

    private String nome;
    private String localização;

    public Editora(String nome, String localização) {
        if("DC Comics".equals(nome)){
            throw new EditoraException("DC Comics. Fala sério.. Só pode ser brincadeira");
        }
        this.nome = nome;
        this.localização = localização;
    }
}
