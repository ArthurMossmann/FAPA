package ExerciciosLista5;

/*
3. (ExeMatriz03) Faça um algoritmo que gere randomicamente uma matriz de 5 X 5 de inteiros
positivos e mostre a soma de cada coluna separadamente.
 */

public class Exercicio3 {
    static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int j = 0; j < matriz.length; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                int aleatorio = (int)(Math.random() * 100) + 1;
                matriz[i][j] = aleatorio;
                soma += matriz[i][j];
            }
            System.out.printf("\nA soma deles é: %d4",soma);
        }
    }
}

