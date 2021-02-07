package oo_exerc01;

public class Aplicacao {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("A soma de 50 + 35 = " + calculadora.soma(50, 35));
        System.out.println("A subtração 50 - 35 = " + calculadora.subtrai(50, 35));
        System.out.println("A multipliação 5 * 3 = " + calculadora.multiplica(5, 3));
        System.out.println("A divisão 15 / 3 = " + calculadora.dividi(15, 3));
    }
}
