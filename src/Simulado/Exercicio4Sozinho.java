package Simulado;
import java.util.Scanner;

public class Exercicio4Sozinho {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        int lugares = 4;
        int andar = 4;
        int[][] vagas = new int[andar][lugares];

        for (int l = 0; l < lugares; l++) {
            for (int c = 0; c < andar; c++) {
                System.out.printf("Digite o tempo em horas para o lugar [%d][%d]: ", l, c);
                vagas[l][c] = var.nextInt();
            }
        }
        somarDiagonalPrincipal(vagas,lugares,andar);
        contarLongaDuracao(vagas,lugares,andar);
        for (int l = 0; l <lugares; l++) {
            for (int c = 0; c < andar ; c++) {
                System.out.print(vagas[l][c] + "\t");

            }
            System.out.println();
        }

    }


    public static int somarDiagonalPrincipal(int [][] Matriz, int lugares, int andares) {
    int soma = 0;
        for (int l = 0; l < lugares ; l++) {
            for (int c = 0; c <andares ; c++) {
                if (l == c) {
                    soma += Matriz[l][c];
                }
            }
        }
        System.out.printf("\nSoma da Diagonal Principal: %d%n", soma);
        return soma;
    }

    public static int contarLongaDuracao(int[][] Matriz, int andar, int lugar) {
        int contador = 0;
        for (int l = 0; l < lugar ; l++) {
            for (int c = 0; c < andar ; c++) {
                if (Matriz[l][c] > 5)
                    contador++;
            }
        }
        System.out.printf("Quantidade de carros estacionados há mais de 5 horas: %d%n", contador);
        return contador;
    }


}