public class Main {
    public static void main(String[] args) {

        System.out.println("Exercicio calculadora: ");
        Calculadora.soma(10, 20);
        Calculadora.subtracao(30, 15);
        Calculadora.multiplicacao(3, 3);
        Calculadora.divisao(4, 2);


        System.out.println("Exercicio mensagem: ");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);


        System.out.println("Exercicio emprestimo: ");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    
    }
}
