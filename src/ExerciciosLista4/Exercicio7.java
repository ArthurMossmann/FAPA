package ExerciciosLista4;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        int vetorX[] = new int[10];

        System.out.println("digite os  numeros do vetor");
        for (int i = 0; i < 10; i++) {
            System.out.println("elemento [" + i + "]: ");
            vetorX[i] = var.nextInt();
        }

        int vetorY[] = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetorY[i] = vetorX[i] * 2;
            } else {
                vetorY[i] = vetorX[i] * 3;
            }
        }

        System.out.println("\nVetor Y:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Y [ " + i + " ] = " + vetorY[i]);
        }
    }
}