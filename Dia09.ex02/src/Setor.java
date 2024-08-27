public enum Setor {
    ENGENHARIA ("Engenharia"),
    JURIDICO ("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACAO("Operacao");

    String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
