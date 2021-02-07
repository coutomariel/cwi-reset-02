package oo_exerc02;

public class Aplicacao {
    public static void main(String[] args) {
        Comparador comparador = new Comparador();

        System.out.println("5 é menor que 3 ? " + comparador.menorQue(5,3));
        System.out.println("3 é menor que 5 ? " + comparador.menorQue(3,5));
    }
}
