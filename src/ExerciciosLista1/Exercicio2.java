package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")
/*2. (Lista1_02) Construa um programa em Java que leia (via teclado) três números do tipo
inteiro, calcule e mostre o resultado da soma deles.
 */

public class Exercicio2 {
    static void main(String[] args) {
        Scanner var =new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int n1 = var.nextInt();

        System.out.println("Digite o segundo numero:");
        int n2 = var.nextInt();

        System.out.println("Digite o terceiro numero:");
        int n3 =var.nextInt();

        int resultado = somasdosnumeros(n1,n2,n3);

        System.out.printf("%d + %d + %d é: %d",n1,n2,n3,resultado);
    }

    static int somasdosnumeros(int A, int B, int C) {
        return A+B+C;
    }
}