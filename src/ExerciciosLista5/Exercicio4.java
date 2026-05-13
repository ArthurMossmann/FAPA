package ExerciciosLista5;

/*
4. (ExeMatriz04) Faça um algoritmo que gere randomicamente uma matriz de 10 X 10 de
inteiros. Calcule e mostre a soma das linhas pares da matriz.
 */


import Lib.Funcoes;

public class Exercicio4 {
    static void main(String[] args) {

        int linhas = 10;
        int colunas = 10;

        int[][] matriz = new int[linhas][colunas];

        Funcoes.geradadosdamatriz(matriz,linhas,colunas);
        Funcoes.imprimirmatriz(matriz,linhas,colunas);
        Funcoes.mostrarSomaLinhasPares(matriz,linhas,colunas);


    }
}

