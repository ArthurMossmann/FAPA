package ExerciciosLista2;
import java.util.Scanner;

/*
10. (ExeSelecao10.java) Produtos em uma mercearia possuem preços variados de acordo com
o tipo de produto e a quantidade a ser comprada. Implemente um programa em Java que

apresente a lista de produtos disponíveis juntamente com seus preços e solicite ao usuário
que escolha (1) o produto a ser comprado e (2) a quantidade escolhida do produto e informe
o valor da compra. Os produtos e seus preços são: banana (R$ 0,30 se forem compradas
menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze), laranja (R$ 0,40 se
forem compradas menos que uma dúzia, e R$ 0,35 se forem compradas pelo menos doze),
maçã (R$ 0,50 se forem compradas menos que uma dúzia, e R$ 0,45 se forem compradas pelo
menos doze), kiwi (R$ 0,40 se forem compradas menos que uma dúzia, e R$ 0,30 se forem
compradas pelo menos doze). (DICA: utilizar “if-else” e “switch()” como estruturas de
seleção, e dados tipo “double” com duas casas decimais (%.2f) para a representação dos
preços a serem cobrados. Utilizar um único “printf()” para montar o menu de opções
conforme ilustração abaixo)
 */


/*
banana (12 < R$ 0,30) (12 > R$ 0,25)
laranja (12 < R$ 0,40) (12 > R$ 0,35)
maçã (12 < R$ 0,50) (12 > R$ 0,45)
kiwi (12 < R$ 0,40) (12 > R$ 0,30)
 */

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        double preco;
        double valortotal = 0;

        System.out.printf("======== Tabela de Produtos e Preços ========\n"
        + ("1. Banana - R$ 0,30 (menos de 12) / R$ 0,25 (12 ou mais)\n")
        + ("2. Laranja - R$ 0,40 (menos de 12) / R$ 0,35 (12 ou mais)\n")
        + ("3. Maçã - R$ 0,50 (menos de 12) / R$ 0,45 (12 ou mais)\n")
        + ("4. Kiwi - R$ 0,40 (menos de 12) / R$ 0,30 (12 ou mais)\n")
        + ("Digite o número do produto que deseja comprar (ou -1 para sair): ")
        ); int produto = var.nextInt();

        switch (produto) {
            case 1:
                System.out.printf("Digite a quantidade de bananas: ");
                int quantidadeBanana = var.nextInt();
                if (quantidadeBanana < 12) {
                    preco = 0.30;
                    valortotal = (preco * quantidadeBanana);
                } else if (quantidadeBanana >= 12) {
                    preco = 0.25;
                    valortotal = (preco * quantidadeBanana);
                }
                break;
            case 2:
                System.out.printf("Digite a quantidade de laranjas: ");
                int quantidadeLaranja = var.nextInt();
                if (quantidadeLaranja < 12) {
                    preco = 0.40;
                    valortotal = (preco * quantidadeLaranja);
                    break;
                } else if (quantidadeLaranja >= 12) {
                    preco = 0.35;
                    valortotal = (preco * quantidadeLaranja);
                    break;
                }
            case 3:
                System.out.printf("Digite a quantidade de maçãs: ");
                int quantidadeMaca = var.nextInt();
                if (quantidadeMaca < 12) {
                    preco = 0.50;
                    valortotal = (preco * quantidadeMaca);
                    break;
                } else if (quantidadeMaca >= 12) {
                    preco = 0.45;
                    valortotal = (preco * quantidadeMaca);
                    break;
                }
            case 4:
                System.out.printf("Digite a quantidade de kiwis: ");
                int quantidadeKiwi = var.nextInt();
                if (quantidadeKiwi < 12) {
                    preco = 0.40;
                    valortotal = (preco * quantidadeKiwi);
                    break;
                } else if (quantidadeKiwi >= 12) {
                    preco = 0.30;
                    valortotal = (preco * quantidadeKiwi);
                    break;
                }
            default:
                if (produto == -1) {
                    System.out.println("Saindo do programa...");
                    break;
                } else {
                System.out.println("Produto inválido!");}
                break;
        }
        System.out.printf("Valor total da compra: R$ %.2f\n", valortotal);
    }
}