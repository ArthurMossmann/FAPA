package Matriz;

import java.util.Random;

public class Aula {
    public static void main(String[] args) {
        // Inicialização de matrizes 3x3
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        Random random = new Random();

        // Preenchendo a matriz A com números aleatórios de 0 a 9
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = random.nextInt(10);
            }
        }

        // Preenchendo a matriz B com números aleatórios de 0 a 9
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = random.nextInt(10);
            }
        }

        // CORREÇÃO: Matriz C deve ter [linhas de A] x [colunas de B]
        int[][] c = new int[a.length][b[0].length];

        // Multiplicação de matrizes
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                int k = a[0].length; // Número de colunas de A (deve ser igual às linhas de B)
                for (int kx = 0; kx < k; kx++) {
                    c[i][j] += a[i][kx] * b[kx][j];
                }
            }
        }

        // Impressão da Matriz A (CORRIGIDO: usando a[0].length)
        System.out.println("Matriz A:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Impressão da Matriz B
        System.out.println("Matriz B:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // Impressão da Matriz C (Resultante)
        System.out.println("Matriz C (A x B):");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
