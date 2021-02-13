package exercicio.um;

public class Aplicacao {

    public static void main(String[] args) {

        Filme troia = new Filme("Tróia", "Descrição do filme", 210, 2004,
                5, new Diretor("Wolfgang Petersen", 79, 45, Genero.MASCULINO));

        Filme regresso = new Filme("O regresso", "Descrição do filme O regresso", 240,
                2016,5,new Diretor("Alejandro González Iñárritu", 57,
                22, Genero.MASCULINO));

        troia.reproduzir();
        regresso.reproduzir();

        Ator angelinaJolie = new Ator("Angelina Jolie", 45, 2, Genero.FEMININO);
        Ator scarlettJohansson = new Ator("Scarlett Johansson",36, 1, Genero.FEMININO);

        troia.getDiretor().apressentar();
        regresso.getDiretor().apressentar();
        angelinaJolie.apressentar();
        scarlettJohansson.apressentar();

    }


}
