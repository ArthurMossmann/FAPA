package ExerciciosLista2;
import java.util.Scanner;
@SuppressWarnings("unused")

/*2. (ExeSelecao02.java) Construa um programa em Java para ler um valor, verificar se é par
ou ímpar e mostrar essa informação. (DICA: Usar if/else e o operador aritmético % para
mostrar se valor é par ou ímpar. Ex. (valor % 2 == 0) é par...)
 */

public class Exercicio2 {
    void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = var.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }

    }


}

