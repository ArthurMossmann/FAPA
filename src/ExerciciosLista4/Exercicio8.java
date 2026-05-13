package ExerciciosLista4;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int vetorM[] = new int[10];

        System.out.println("digite os  numeros do vetor");
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento [" + i + "]: ");
            vetorM[i] = var.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int temp = vetorM[i];
            vetorM[i] = vetorM[i + 5];
            vetorM[i + 5] = temp;
        }

        System.out.println("\nVetor modificado:");
        for (int i = 0; i < 10; i++) {
            System.out.println("M[" + i + "] = " + vetorM[i]);
        }
    }
}