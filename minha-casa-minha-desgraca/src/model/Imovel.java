package model;

public abstract class Imovel {

    private Endereco endereco;
    private Double valor;

    public String apresentacao(){
        return "localizado em " +
                this.endereco.getLogradouro() + ", " +
                this.endereco.getNumero() + ", " +
                this.endereco.getComplemento() + ", " +
                "bairro " + this.endereco.getBairro() + ", " +
                this.endereco.getCidade() + "-" +
                this.endereco.getEstado().getSigla() +
                ". Valor: "
                + this.valor;
    }

    public Imovel(Endereco endereco, Double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
