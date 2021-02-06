package oo;

public class Aplicacao {
    public static void main(String[] args) {
        Carro palio = new Carro("Fiat", "Pálio", 2000, 4);
        palio.abastecer(50);
        palio.abastecer(35.00f);

        System.out.println("O veículo está etacionado: " + palio.isEstacionado());

        palio.abastecer(45);

        System.out.println("O veículo está etacionado: " + palio.isEstacionado());
        System.out.println("O veículo ficou com " + " x " + " combustível");



    }
}
