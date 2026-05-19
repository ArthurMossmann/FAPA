package ExerciciosLista7.Exercicio5;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.print("Alíquota de ICMS (ex: 12 para 12%): ");
        double aliquota = var.nextDouble();
        var.nextLine();

        ItemNotaFiscal[] itens = new ItemNotaFiscal[3];

        for (int i = 1; i <= 3; i++) {
            System.out.println("\n--- Item " + i + " ---");

            System.out.print("Descrição: ");
            String descricao = var.nextLine();

            System.out.print("Preço unitário: R$ ");
            double preco = var.nextDouble();

            System.out.print("Quantidade: ");
            int qtd = var.nextInt();
            var.nextLine();

            itens[i - 1] = new ItemNotaFiscal(descricao, preco, qtd, aliquota);
        }

        NotaFiscal nota = new NotaFiscal(itens[0], itens[1], itens[2]);

        System.out.println();
        nota.mostrar();

        var.close();
    }
}