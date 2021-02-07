package oo_exerc03;

public class Aplicacao {
    public static void main(String[] args) {
        Aluno romeu = new Aluno("Romeu", 5.55);
        System.out.println(romeu.getNome() + " obteve nota final de " + romeu.getNotaFinal() + " e está " + romeu.getSituacao());

        Aluno julieta = new Aluno("Romeu", 7.55);
        System.out.println(julieta.getNome() + " obteve nota final de " + julieta.getNotaFinal() + " e está " + julieta.getSituacao());

    }
}
