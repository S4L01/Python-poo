public class Diretor extends CargoDeConfiaca implements Contratacao{
    private final double PREMIO = 0.5;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, bonificacao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                super.toString()+
                "PREMIO=" + PREMIO +
                "\nBonificacao:" + bonificacao+
                "\nSalario Final:"+getSalarioFinal(salario)

                ;
    }

    @Override
    public double getSalarioFinal(double salario) {
        double salarioFinal = 0.0;
        salarioFinal = salario * super.bonificacao.DIRETOR.getValor() +(salario*PREMIO);
        return salarioFinal;
    }

}
