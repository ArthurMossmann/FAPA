package ExerciciosLista4;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int[] A = new int[30];
        int[] B = new int[30];
        int[] C = new int[30];
        int k = 0;

        System.out.println("Digite 30 valores para o vetor A:");
        for (int i = 0; i < 30; i++) {
            A[i] = var.nextInt();
        }

        System.out.println("Digite 30 valores para o vetor B:");
        for (int i = 0; i < 30; i++) {
            B[i] = var.nextInt();
        }

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (A[i] == B[j]) {
                    C[k] = A[i];
                    k++;
                    break;
                }
            }
        }

        System.out.println("\nVetor C (intersecao):");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }

    }
}