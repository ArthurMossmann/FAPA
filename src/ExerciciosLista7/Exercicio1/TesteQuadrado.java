package ExerciciosLista7.Exercicio1;

import java.util.Scanner;

public class TesteQuadrado {
    static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        Scanner var = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        double Lado = var.nextDouble();
        System.out.printf("Área do quadrado: %.2f%n ",Quadrado.Area(Lado));
        System.out.printf("Perímetro do quadrado: %.2f%n ", Quadrado.Perimetro(Lado));
        System.out.printf("Valor da diagonal do quadrado: %.2f%n", Quadrado.ValorDaDiagonal(Lado));
    }
}


