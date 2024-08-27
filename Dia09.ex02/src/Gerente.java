public class Gerente extends CargoDeConfiaca{

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento, bonificacao);
    }


    @Override
    public String toString() {
        return "\nGerente:" +
                super.toString()+
                "\nBonificacao:" + bonificacao+
                "\nSalario Final:"+getSalarioFinal(salario)

                ;
    }


    @Override
    public double getSalarioFinal(double salario) {
        double salarioFinal = 0.0;
        salarioFinal = salario * super.bonificacao.GERENTE.getValor();
        return salarioFinal;
    }
}
