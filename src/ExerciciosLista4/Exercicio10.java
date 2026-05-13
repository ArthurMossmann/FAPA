package ExerciciosLista4;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        int numeros;
        int impar = 0;
        int par = 0;
        int vetorimpar[] = new int[10];
        int vetorpar[] = new int[10];

        System.out.println("digite varios numeros MAX 20: ");
        System.out.println("para sair digite 0: ");

        while (true) {
            numeros = var.nextInt();

            if (numeros == 0) {
                break;
            }
            if (numeros %2 == 0){
                vetorpar[par] = numeros;
                par++;
            }
            else {
                if (impar < 10){
                    vetorimpar[impar] = numeros;
                    impar++;
                }
            }
            if (par == 10 || impar == 10 ){
                break;
            }
        }

        System.out.println("\npares: ");
        for (int i = 0; i < par; i++) {
            System.out.print(vetorpar[i] + " ");
        }

        System.out.println("\nimpares: ");
        for (int i = 0; i < impar; i++) {
            System.out.print(vetorimpar[i] + " ");
        }
    }
}