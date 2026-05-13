package Lib;

import java.security.SecureRandom;

public class Funcoes {
    public static void imprimirmatriz(int[][] matriz, int linhas, int colunas) {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf("%4d |", matriz[l][c]);

            }
            System.out.println();
        }
    }

    public static void geradadosdamatriz(int[][] matriz, int linhas, int colunas) {
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);
            }
        }
    }

    public static int somadamatriz(int[][] matriz, int linhas, int colunas) {
        int soma = 0;
        for (int l = 0; l < linhas; l++) {

            for (int c = 0; c < colunas; c++) {
                int aleatorio = new SecureRandom().nextInt(100);
                matriz[l][c] = aleatorio;
                soma += matriz[l][c];
            }
        }
        return soma;
    }

    public static void mostrarSomaLinhasPares(int[][] matriz, int linhas, int colunas) {
        int somaTotalPares = 0;

        System.out.println("\n--- SOMA DAS LINHAS PARES ---");
        for (int l = 0; l < linhas; l++) {
            if (l % 2 == 0) {
                int somaDaLinha = 0;
                for (int c = 0; c < colunas; c++) {
                    somaDaLinha += matriz[l][c];
                }
                // %d é para números inteiros, \n para pular linha
                System.out.printf("Linha %d | Soma: %d%n", l, somaDaLinha);
                somaTotalPares += somaDaLinha;
            }
        }
        System.out.printf("%nSoma TOTAL de todas as linhas pares: %d%n", somaTotalPares);
    }
}




