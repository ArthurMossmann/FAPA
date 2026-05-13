package ExerciciosLista4;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int[] vetor = new int[6];
        int opcao;

        System.out.println("Digite 6 numeros: ");
        for (int i = 0; i < 6; i++) {
            vetor[i] = var.nextInt();
        }

        System.out.println("\nEscolha a opcao desejada:");
        System.out.println("1- Soma dos elementos");
        System.out.println("2- Produto dos elementos");
        System.out.println("3- Media dos elementos");
        System.out.println("4- Mostrar vetor");
        opcao = var.nextInt();

        if (opcao == 1) {
            int soma = 0;
            for (int i = 0; i < 6; i++) {
                soma += vetor[i];
            }
            System.out.println("Soma = " + soma);

        } else if (opcao == 2) {
            int produto = 1;
            for (int i = 0; i < 6; i++) {
                produto *= vetor[i];
            }
            System.out.println("Produto = " + produto);

        } else if (opcao == 3) {
            int soma = 0;
            for (int i = 0; i < 6; i++) {
                soma += vetor[i];
            }
            double media = soma / 6.0;
            System.out.println("Media = " + media);

        } else if (opcao == 4) {
            System.out.println("Vetor:");
            for (int i = 0; i < 6; i++) {
                System.out.print(vetor[i] + " ");
            }

        } else {
            System.out.println("Opção invalida");
        }

    }
}