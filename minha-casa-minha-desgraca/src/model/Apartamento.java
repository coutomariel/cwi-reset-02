package model;

public class Apartamento extends  Imovel {

    private String andar;

    public Apartamento(Endereco endereco, Double valor, String andar) {
        super(endereco, valor);
        this.andar = andar;
    }

    @Override
    public String apresentacao() {
        return "Apartamento no " + this.andar + "o andar de um edificio " + super.apresentacao();
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }
}
