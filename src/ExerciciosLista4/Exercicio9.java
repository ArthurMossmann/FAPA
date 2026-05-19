package ExerciciosLista4;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];

        System.out.println("Digite os 10 valores do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = var.nextInt();
        }

        System.out.println("Digite os 10 valores do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = var.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            C[i] = A[i];
        }

        for (int i = 0; i < 10; i++) {
            C[i + 10] = B[i];
        }

        System.out.println("Vetor C (uniao):");
        for (int i = 0; i < 20; i++) {
            System.out.print(C[i] + " ");
        }
    }
}