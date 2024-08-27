public class Motorista extends Funcionario{
    private String carteiraHabilitacao;

    public Motorista(String nome, String cpf, String rg, Endereco endereco) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, dataNascimento);
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    public void setCarteiraHabilitacao(String carteiraHabilitacao) {
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "\nMotorista:" +
                "\nCarteira Habilitacao:" + carteiraHabilitacao +
                super.toString()+
                "\nSalario Final:"+getSalarioFinal(salario)
                ;
    }

    @Override
    public double getSalarioFinal(double salario) {
        return this.salario;
    }
}
