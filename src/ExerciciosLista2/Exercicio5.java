package ExerciciosLista2;
import java.util.Scanner;

/*
5. (ExeSelecao05.java) Construa um programa em Java para ler um valor, verificar se está no
intervalo (100, 200) e mostrar essa informação. (DICA: Usar if/else e operador lógico &&.
 */



public class Exercicio5 {
    static void main() {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite um numero e verificaremos se ele está no intervalo entre 100 e 200");
        float numero = var.nextFloat();

        if (numero >= 100 && numero <= 200){
            System.out.printf("O numero %.2f está no intervalo entre 100 e 200", numero);
        } else {
            System.out.printf("O numero %.2f não está no intervalo entre 100 e 200", numero);
        }
    }
}