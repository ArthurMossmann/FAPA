package ExerciciosLista6;
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n1 = sc.nextInt();

        int pares = 0, impares = 0;
        int somaPares = 0, somaImpares = 0;

        for (int i = 1; i <= n1; i++) {
            if (i % 2 == 0) {
                pares++;
                somaPares += i;
            } else {
                impares++;
                somaImpares += i;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

    }
}