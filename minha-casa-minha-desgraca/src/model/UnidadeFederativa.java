package model;

public enum UnidadeFederativa {

    AMAZONAS("Amazonas", "AM", 0.5),
    ALAGOAS("Alagoas", "AL", 0.5),
    ACRE("Acre", "AC", 0.5),
    AMAPA("Amapá", "AP", 0.5),
    BAHIA("Bahia", "BA", 0.5),
    PARA("Pará", "PA", 0.5),
    MATO_GROSSO("Mato Grosso", "MT", 0.5),
    MINAS_GERAIS("Minas Gerais", "MG", 0.5),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", 0.5),
    GOIAS("Goiás", "GO", 0.5),
    MARANHAO("Maranhão", "MA", 0.5),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", 0.5),
    TOCANTINS("Tocantins", "TO", 0.5),
    PIAUI("Piauí", "PI", 0.5),
    SAO_PAULO("São Paulo", "SP", 0.65),
    RONDONIA("Rondônia", "RO", 0.5),
    RORAIMA("Roraima", "RR", 0.5),
    PARANA("Paraná", "PR", 0.5),
    CEARA("Ceará", "CE", 0.5),
    PERNAMBUCO("Pernambuco", "PE", 0.5),
    SANTA_CATARINA("Santa Catarina", "SC", 0.5),
    PARAIBA("Paraíba", "PB", 0.5),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", 0.5),
    ESPIRITO_SANTO("Espírito Santo", "ES", 0.5),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", 0.6),
    SERGIPE("Sergipe", "SE", 0.5),
    DISTRITO_FEDERAL("Distrito Federal", "DF", 0.5);

    private String nome;
    private String sigla;
    private Double fator;

    UnidadeFederativa(String nome, String sigla, Double fator) {
        this.nome = nome;
        this.sigla = sigla;
        this.fator = fator;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Double getFator() {
        return fator;
    }

    public void setFator(Double fator) {
        this.fator = fator;
    }
}
