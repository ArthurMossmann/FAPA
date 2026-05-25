package ExerciciosLista8.Exercicio1;
import Lib.Funcoes;

public class Teste {
    static void main(String[] args) {
        Funcionario Funcionario1 = new Funcionario("Lucas", "87999650030", 3000.00);
        Funcionario Funcionario2 = new Funcionario("Gabriel", "12345678900", 3000.00);

        Gerente Gerente1 = new Gerente("Arthur", "05236272033", 3000.00, "RH");

        System.out.println("--- EXIBINDO FUNCIONÁRIOS ---");
        System.out.println();

        Funcoes.imprimirFuncionario(Funcionario1);
        Funcoes.imprimirFuncionario(Funcionario2);

        System.out.println("\n--- EXIBINDO GERENTE ---");
        System.out.println();
        Funcoes.imprimirGerente(Gerente1);

    }
}
