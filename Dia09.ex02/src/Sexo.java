public enum Sexo {
    FEMININO ("Feminino"),
    MASCULINO ("Masculino");

    String nome;

    Sexo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
