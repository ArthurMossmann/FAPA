package ExerciciosLista6;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int soma = 0;


        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }


        if (soma == n) {
            System.out.println("O número " + n + " é um número perfeito.");
        } else {
            System.out.println("O número " + n + " NÃO é um número perfeito.");
        }

        sc.close();
    }
}