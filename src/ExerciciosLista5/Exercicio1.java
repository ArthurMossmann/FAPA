package ExerciciosLista5;


/*1. (ExeMatriz01) Faça um algoritmo que gere aleatoriamente uma matriz de inteiros 7 x 9,
imprima a matriz e calcule e imprima a soma dos seus elementos.
 */

public class Exercicio1 {
    static void main(String[] args) {

        int[][] matriz = new int[7][9];
        int soma = 0;

        // Preenchimento da matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int aleatorio = (int) (Math.random() * 100);
                matriz[i][j] = aleatorio;
                soma += aleatorio;
            }
        }

        // Impressão em formato de planilha
        System.out.println("--- Matriz 7x9 ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // Imprime o número com 4 espaços de largura na mesma linha
                System.out.printf("%4d", matriz[i][j]);
            }
            // Pula para a próxima linha após imprimir todas as colunas (j)
            System.out.println();
        }

        System.out.println("\nA soma é: " + soma);
    }
}