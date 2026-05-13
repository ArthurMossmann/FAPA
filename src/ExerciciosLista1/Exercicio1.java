package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")
/*1. (Lista1_01) Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
calcule o produto entre eles e mostre o resultado.*/


public class Exercicio1 {
    static void main(String[] args) {


        Scanner var = new Scanner(System.in);

        System.out.println("Digite o primeriro numero");
        int n1 = var.nextInt();

        System.out.println("digete o segundo numero");
        int n2 = var.nextInt();

        int resultado = calculodoproduto(n1 ,n2);

        System.out.printf("%d X %d = %d",n1,n2, resultado);
    }

    static int calculodoproduto(int A, int B) {

       return A * B;

    }


}