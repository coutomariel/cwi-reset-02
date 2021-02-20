package model;

public enum UnidadeFederativa {

    AMAZONAS("Amazonas", "AM"),
    ALAGOAS("Alagoas", "AL"),
    ACRE("Acre", "AC"),
    AMAPA("Amapá", "AP"),
    BAHIA("Bahia", "BA"),
    PARA("Pará", "PA"),
    MATO_GROSSO("Mato Grosso", "MT"),
    MINAS_GERAIS("Minas Gerais", "MG"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS"),
    GOIAS("Goiás", "GO"),
    MARANHAO("Maranhão", "MA"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
    TOCANTINS("Tocantins", "TO"),
    PIAUI("Piauí", "PI"),
    SAO_PAULO("São Paulo", "SP", 0.65),
    RONDONIA("Rondônia", "RO"),
    RORAIMA("Roraima", "RR"),
    PARANA("Paraná", "PR"),
    CEARA("Ceará", "CE"),
    PERNAMBUCO("Pernambuco", "PE"),
    SANTA_CATARINA("Santa Catarina", "SC"),
    PARAIBA("Paraíba", "PB"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
    ESPIRITO_SANTO("Espírito Santo", "ES"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", 0.6),
    SERGIPE("Sergipe", "SE"),
    DISTRITO_FEDERAL("Distrito Federal", "DF");

    private String nome;
    private String sigla;
    private Double fator;

    UnidadeFederativa(String nome, String sigla) {
        this(nome, sigla, 0.5);
    }

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
