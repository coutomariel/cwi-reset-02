import model.Beneficiario;
import model.Imovel;

import java.text.DecimalFormat;

public class PropostaFinanciamento {

    /**
     * Valida a proposta de financiamento e apresenta o resultado para o cliente.
     *
     * A proposta de financiamento é aceita somente se o salário do beneficiário multiplicado pelo prazo de pagamento
     *   for equivalente a pelo menos 50% do valor do imóvel.
     *
     *   Esta regra possui duas exceções: se o imóvel se localiza no estado SP ou RJ,
     *      o salário multiplicado pelo prazo deve ser equivalente a 65% e 60% do valor imóvel (respectivamente).
     */

    final private Beneficiario beneficiario;
    final private Imovel imovel;
    final private Integer prazo;

    public void validarProposta() {
        if(getCapacidadePagamento() >= getCapacidadeExigida()){
            imprimirPropostaAprovada();
        } else {
            imprimirPropostaNegada();
        }
    }

    private double getCapacidadeExigida(){
        return this.imovel.getEndereco().getEstado().getFator();
    }

    private double getCapacidadePagamento(){
        return this.beneficiario.getSalario() * prazo / imovel.getValor();
    }


    private void imprimirPropostaAprovada(){
        System.out.println(
                "Beneficiário: " + this.beneficiario.getNome() + "\n" +
                "Imóvel: " + this.imovel.apresentacao() + "\n" +
                "Prazo: "  + this.prazo + " meses.\n" +
                "Parabéns!!! Sua proposta foi aprovada. ;)"

        );
    }

    private void imprimirPropostaNegada(){
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(
                "Beneficiário: " + this.beneficiario.getNome() + "\n" +
                "Imóvel: " + this.imovel.apresentacao() + "\n" +
                "Prazo: "  + this.prazo + " meses.\n" +
                "Infelizmente sua proposta não pode ser aprovada.\n" +
                "Ao longo de " + this.prazo + " meses sua renda atingiu apenas " +
                fmt.format(getCapacidadePagamento() * 100) + "% do valor do imóvel.\n" +
                "Para o estado do "+ this.imovel.getEndereco().getEstado().getNome() +
                " é exigido um minimo de " +
                fmt.format(getCapacidadeExigida() * 100) + "% do valor do imóvel.\n"
        );
    }

    public PropostaFinanciamento(Beneficiario beneficiario, Imovel imovel, Integer prazo) {
        this.beneficiario = beneficiario;
        this.imovel = imovel;
        this.prazo = prazo;
    }
}
