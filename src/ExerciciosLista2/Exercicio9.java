package ExerciciosLista2;
import java.util.Scanner;

/*
9. (ExeSelecao9.java) Laranjas em um mercado de produtos orgânicos custam R$ 0,30 se
forem compradas menos que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
Construa um programa em Java que leia o número de laranjas compradas, calcule e escreva o
valor total da compra. Implementar uma validação da quantidade de frutas a serem
compradas para evitar que seja lido um número de laranjas menor (negativo) ou igual a zero.
(DICA: utilizar “if-else” como estrutura de seleção e dados tipo “double” com duas casas
decimais (%.2f) para a representação dos preços a serem cobrados)
 */

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite o número de laranjas compradas:");
        int quantidade = var.nextInt();


        /* para Simplificar poderia usar "double precoUnitario = (quantidade >= 12) ? 0.50 : 1;"
        depois faria o cálculo do valor total,
        mas para seguir a dica do exercício, utilizei o if-else
        para definir o preço unitário e calcular o valor total da compra.
         */



        if (quantidade <= 0) {
            System.out.println("Erro: A quantidade de laranjas não pode ser negativa.");
        } else if (quantidade < 12) {
            double  precoUnitario = 0.30;
            double  valorTotal = quantidade * precoUnitario;
            System.out.printf("Valor total da compra: R$ %.2f\n", valorTotal);
        }else {
            double precoUnitario = 0.25;
            double valorTotal = quantidade * precoUnitario;
            System.out.printf("Valor total da compra: R$ %.2f\n", valorTotal);
        }


    }
}