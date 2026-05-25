package ExerciciosLista3;
import java.util.Scanner;

/*
1. (ExeRepeticao01) Crie um programa em Java que receba do usuário um número inteiro
positivo e informe os totais de números pares e ímpares encontrados entre 1 e o número
digitado + o somatório dos pares e ímpares separadamente.
 */


public class Exercicio1{
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int totaldepaares = 0;
        int totaldeimpar = 0;
        int somadepares = 0;
        int somadeimpar = 0;

        System.out.println("Digite um número inteiro positivo: ");
        int numero = var.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                totaldepaares++;
                somadepares += i;
                System.out.println(i + " é par.");
            } else {
                totaldeimpar++;
                somadeimpar += i;
                System.out.println(i + " é ímpar.");
            }
        }

        System.out.println("Total de números pares: " + ( totaldeimpar));
        System.out.println("Total de números ímpares: " + (totaldeimpar));
        System.out.printf("Soma dos números pares: %d\n", somadepares);
        System.out.printf("Soma dos números ímpares: %d\n", somadeimpar);
    }
}