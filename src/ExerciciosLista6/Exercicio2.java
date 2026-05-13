package ExerciciosLista6;
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;


        do {
            System.out.print("Digite o valor de A: ");
            A = sc.nextInt();

            System.out.print("Digite o valor de B (maior que A): ");
            B = sc.nextInt();

            if (A >= B) {
                System.out.println("Erro! A deve ser menor que B. Tente novamente.");
            }

        } while (A >= B);

        int soma = 0;

        System.out.println("Números divisíveis por 5 entre " + A + " e " + B + ":");

        for (int i = A; i <= B; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
                soma += i;
            }
        }

        System.out.println("\nSoma dos números: " + soma);


    }
}