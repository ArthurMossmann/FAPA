package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")

/*
8. (Lista1_08) Construa um programa em Java que leia (via teclado) as horas, minutos e
segundos em determinado momento do dia, e que calcule e mostre qual o total de segundos
decorridos neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).
 */


public class Exercicio8 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("digite as horas");
        int horas = var.nextInt();
        System.out.println("digite os minutos");
        int minutos = var.nextInt();
        System.out.println("digite os segundos");
        int segundos = var.nextInt();

        int total = totaldesegundos(horas,minutos,segundos);

        System.out.printf("\nO total de segundos decorridos no dia é: %d segundos\n", total);
    }

    static int totaldesegundos(int A, int B, int C) {
        return (A * 60 * 60) + (B * 60) + C;
    }
}