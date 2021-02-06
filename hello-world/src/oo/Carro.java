package oo;

public class Carro {

    private String marca;

    private String modelo;

    private int ano;

    private int portas;

    private float quantidadeCombustivel;

    private boolean estacionado;

    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.portas = portas;
    }

    void abastecer(float quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    void acelerar(int velocidadeDesejada){
        this.estacionado = false;
        this.velocidadeAtual = velocidadeDesejada;
        this.quantidadeCombustivel -= velocidadeDesejada * 0.2;
    }

    void estacionar(){
        this.estacionado = true;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getPortas() {
        return portas;
    }

    public boolean isEstacionado() {
        return estacionado;
    }
}
