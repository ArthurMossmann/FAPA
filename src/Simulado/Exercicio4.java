package Simulado;
import java.util.Scanner;


/*
Uma empresa administra um parque de estacionamento coberto no centro da cidade. A ocupação
e o tempo de permanência dos carros são mapeados através de uma matriz quadrada 4x4 de
números inteiros (onde as linhas representam os andares do edifício e as colunas representam os
lugares de cada anda (vagas)). O valor digitado na matriz representa a quantidade de horas (hora
cheia/inteira) que cada carro está estacionado naquele lugar.
Faça um programa em Java com a lógica rigorosamente separada em funções:
• No main, declare e preencha essa matriz 4x4 via teclado, solicitando o tempo em horas
para cada lugar.
• Crie uma função somarDiagonalPrincipal que receba a matriz por parâmetro e retorne a
soma das horas dos carros estacionados na diagonal principal do parque.
• Crie uma função contarLongaDuracao que receba a matriz por parâmetro e retorne a
quantidade de carros que estão estacionados há estritamente mais de 5 horas.
• No método main, utilize as funções e imprima os resultados. Ao final, imprima a matriz
completa.
DICAS PARA A QUESTÃO 4:
• Como criar a Função: As funções devem ficar fora do main. A sua estrutura base será algo
como: public static int somarDiagonalPrincipal(int[][] matriz) { ... }
• A Diagonal Principal: Numa matriz quadrada, os elementos da diagonal principal são
aqueles em que o índice da linha é exatamente igual ao da coluna (ex: [0][0], [1][1], [2][2],
[3][3]). Dentro da sua função, use dois laços for aninhados para percorrer tudo e um if
(linha == coluna) para capturar e somar apenas estes valores específicos.
• Contadores em Funções: Na função contarLongaDuracao, declare uma variável int
contador = 0; logo no início. Toda vez que o seu laço encontrar uma posição com valor >
5, faça contador++;. No final da função (fora de todos os laços), utilize o comando return
contador;.
• Desenhando a Matriz: Para imprimir a matriz no main no formato visual de tabela, use o
comando System.out.print(matriz[linha][coluna] + "\t"); (repare que é print e não println).
O \t aplica um espaçamento perfeito entre os números. Logo após o laço de dentro
(colunas) terminar, coloque um System.out.println(); vazio para que o próximo andar do
estacionamento seja impresso na linha de baixo!
 */

public class Exercicio4 {
    static void main() {
        int andares = 4;
        int lugares = 4;

        int[][] matriz= new int[andares][lugares];
        Scanner scanner = new Scanner(System.in);

        for (int l = 0; l < andares ; l++) {

            for (int c = 0; c < lugares; c++) {
                System.out.printf("Digite o tempo em horas para o lugar [%d][%d]: ", l, c);
                matriz[l][c] = scanner.nextInt();
            }
        }

       somarDiagonalPrincipal(matriz,andares,lugares);
        contarLongaDuracao(matriz,lugares,andares);
        imprimirMatriz(matriz,lugares,andares);



    }
    public static int somarDiagonalPrincipal(int[][] matriz, int andares, int lugares) {
        int soma = 0;
        for (int l = 0; l < andares; l++) {
            for (int c = 0; c < lugares; c++) {
                if (l == c) {
                    soma += matriz[l][c];
                }
            }
        }
        System.out.printf("\nSoma da Diagonal Principal: %d%n", soma);
        return soma;
    }
    static int contarLongaDuracao(int[][] matriz, int andares, int lugares) {
        int contador = 0;
        for (int l = 0; l < andares; l++) {
            for (int c = 0; c < lugares; c++) {
                if (matriz[l][c] > 5) {
                    contador++;
                }
            }
        }
        System.out.printf("Quantidade de carros estacionados há mais de 5 horas: %d%n", contador);
        return contador;
    }
    static void imprimirMatriz(int[][] matriz, int andares, int lugares) {

        System.out.println("\nMatriz Completa:");
        for (int l = 0; l < andares; l++) {
            for (int c = 0; c < lugares; c++) {
                System.out.print(matriz[l][c] + "\t");
            }
            System.out.println();
        }
    }
}
