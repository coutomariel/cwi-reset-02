public class Exercicios {
    public static void main(String[] args) {

        // Ex: 01
        // Imprimindo o resultado da multiplicação entre dois números
        int valor1 = 3;
        int valor2 = 6;
        int resultado = valor1 * valor2;

        System.out.println("O resultado da multiplicação entre " + valor1 + " e " + valor2 + " eh: " + resultado + "\n");

        // Ex: 02
        // Imprimindo o resto de uma divisão entre dois números
        int restoDaDivisao = valor2 % 3;
        System.out.println("O resto da divisão de " + valor2 + " e " + valor1 + " eh: " + restoDaDivisao + "\n");

        // Ex: 03
        // Imprimindo o resultado de uma comparação entre dois números
        boolean ehMaior = valor2 > valor1;
        boolean ehMenor = valor2 < valor1;

        System.out.println(valor2 + " é maior que " + valor1 + " ? " + ehMaior);
        System.out.println(valor2 + " é menor que " + valor1 + " ? " + ehMenor);
    }
}
