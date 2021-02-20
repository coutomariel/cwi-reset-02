package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enuns.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) {
//        Editora editora = new Editora("DC Comics", "Local desconhecido");
        Filme filme = new Filme("Back to the future", "Melhor filme", 210, 1985,
                7, new Diretor("Jonh Peter", 45, 8, Genero.MASCULINO));
    }

}
