package ExerciciosLista2;
import java.util.Scanner;
@SuppressWarnings("unused")

/*
1. (ExeSelecao01.java) Construa um programa em Java para ler um valor, verificar se é
maior do que 100 e mostrar.
 */



public class Exercicio1 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite um numero");
        float numero= var.nextFloat();

        if (numero > 100){
            System.out.println("O numero é maior que 100");
        } else {
            System.out.println("O numero é menor ou igual a 100");
        }


    }
}