package exercicio.um;

public class Aplicacao {

    public static void main(String[] args) {

        Filme troia = new Filme("Tróia", "Descrição do filme", 210, 2004,
                5, new Diretor("Wolfgang Petersen", 79, 45));

        Filme regresso = new Filme("O regresso", "Descrição do filme O regresso", 240,
                2016,5,new Diretor("Alejandro González Iñárritu", 57,
                22));

        troia.reproduzir();
        regresso.reproduzir();
    }


}
