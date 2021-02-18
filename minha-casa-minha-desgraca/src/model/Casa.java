package model;

public class Casa extends Imovel{

    private Boolean patio;

    public Casa(Endereco endereco, Double valor, Boolean patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    @Override
    public String apresentacao() {
        String temPatio = this.patio ? " com pátio" : " sem patio ";
        return "Casa " + temPatio + super.apresentacao();
    }

    public Boolean getPatio() {
        return patio;
    }

    public void setPatio(Boolean patio) {
        this.patio = patio;
    }
}
