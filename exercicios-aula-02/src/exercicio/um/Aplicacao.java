package exercicio.um;

import java.util.Arrays;

public class Aplicacao {

    public static void main(String[] args) {

        Diretor diretorTroia =  new Diretor("Wolfgang Petersen", 79, 45, Genero.MASCULINO);
        Ator atorTroia = new Ator("Brad Pitt", 45, 1, Genero.MASCULINO);
        Ator outroAtorTroia = new Ator("Outro que eu não lembro", 42, 0, Genero.MASCULINO);
        Filme troia = new Filme("Tróia", "Descrição do filme", 210, 2004,
                5, diretorTroia, Arrays.asList(diretorTroia, atorTroia, outroAtorTroia));

        Diretor diretorRegresso = new Diretor("Wolfgang Petersen", 79, 45, Genero.MASCULINO);
        Filme regresso = new Filme("O regresso", "Descrição do filme O regresso", 240,
                2016,5, diretorRegresso, Arrays.asList(diretorRegresso) );

        troia.reproduzir();
        troia.exibirCreditos();

//        regresso.reproduzir();
//
//        Ator angelinaJolie = new Ator("Angelina Jolie", 45, 2, Genero.FEMININO);
//        Ator scarlettJohansson = new Ator("Scarlett Johansson",36, 1, Genero.FEMININO);
//
//        troia.getDiretor().apressentar();
//        regresso.getDiretor().apressentar();
//        angelinaJolie.apressentar();
//        scarlettJohansson.apressentar();

    }


}
