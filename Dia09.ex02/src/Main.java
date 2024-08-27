//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Endereco endereco = new Endereco("Rua alvaro fraca","90","Ao lado da...","20001","Salvador",UnidadeFederativa.BAHIA);
    Gerente gerente = new Gerente("Salomao","45566555","400028922",endereco,Setor.OPERACAO,Sexo.MASCULINO,3000.00,"10/01",Bonificacao.GERENTE);
    Motorista motorista = new Motorista("Pedro","90039393","102302405",
            endereco = new Endereco("Travessa", "23","ao lado de algo","121313","Salvador",UnidadeFederativa.BAHIA));
    Advogado advogado = new Advogado("Joao","10007","3056565",
            endereco = new Endereco("Rua das pedras","56","Em cima do chao","010991","Salvador",UnidadeFederativa.BAHIA));
    Diretor diretor = new Diretor("Franciele","9098883832","3007565",
            endereco = new Endereco("Laderia do cmt", "98","Na ladeira","20545450","SALVADOR",UnidadeFederativa.BAHIA),Setor.RECURSOS_HUMANOS,Sexo.FEMININO,);
    }
}