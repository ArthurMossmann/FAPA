package ExerciciosLista2;
import java.util.Scanner;
@SuppressWarnings("unused")

/*
3. (ExeSelecao03.java) Construa um programa em Java para ler dois valores e mostrar o
maior deles. (DICA: Usar if/else para mostrar o maior dos valores digitados)
 */

public class Exercicio3 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("digite 2 Valores e mostrará o maior entre eles");
        float n1 = var.nextFloat();
        float n2 = var.nextFloat();

        if(n1>n2){
            System.out.printf("O maior numero é: %.2f", n1);
        } else if (n2>n1) {
            System.out.printf("O maior numero é: %.2f", n2);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}