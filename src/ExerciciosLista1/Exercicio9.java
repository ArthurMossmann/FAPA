package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")

/*
9. (Lista1_09) Construa um programa em Java para ler (via teclado) 3 valores os quais
correspondem ao número de convidados para um churrasco, sendo homens, mulheres e
crianças. Sabendo que, em média, um homem come 650 gramas de carne, uma mulher come
420 gramas de carne, e uma criança come 290 gramas de carne, calcule a quantidade de carne
necessária para o churrasco em quilogramas e mostre o resultado.
 */


public class Exercicio9 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite numero de Homens: ");
        int homem = var.nextInt();
        System.out.println("Digite o numero de Mulheres: ");
        int mulher = var.nextInt();
        System.out.println("DIgite o numero de Crianças: ");
        int crianca = var.nextInt();

        float total = calculadoradochuras(homem,mulher,crianca);
        System.out.printf("\nTotal de carne necessária: %.2f Kg\n",total);

    }

    static float calculadoradochuras(int A, int B, int C) {
        float calcular = (float)(A * 650) + (B * 420) + (C * 290);
        return (calcular / 1000);
    }
}