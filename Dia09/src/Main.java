//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Subtracao subtracao = new Subtracao();

        System.out.println("Soma"+ soma.calcular(3.0,3.0));
        System.out.println("Divisao"+ divisao.calcular(4.0,2.0));
        System.out.println("Multi"+ multiplicacao.calcular(3.0,3.0));
        System.out.println("Subtracao"+ subtracao.calcular(3.0,3.0));
    }
}