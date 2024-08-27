public enum UnidadeFederativa {
    BAHIA("Bahia"),
    SAO_PAULO("São Paulo"),
    RIO_DE_JANEIRO("Rio de Janeiro");

    String nome;

    UnidadeFederativa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
