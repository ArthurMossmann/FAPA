package ExerciciosLista2;
import java.util.Scanner;

/*
4. (ExeSelecao04.java) Construa um programa em Java para ler dois valores e mostrar o
menor deles. (DICA: Usar if/else para mostrar o menor dos valores digitados)
 */

public class Exercicio4 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite 2 Numeros");
        float n1 = var.nextInt();
        float n2 = var.nextInt();

        if (n1<n2){
            System.out.printf("O menor numero é: %.2f", n1);
        } else if (n2 < n1) {
            System.out.printf("O menor numero é: %.2f", n2);
        } else {
            System.out.println("Os numeros são iguais");
        }


    }
}