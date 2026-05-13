package ExerciciosLista2;
import java.util.Scanner;

/*
7. (ExeSelecao07.java) Escreva um programa em Java para ler o número de eleitores de um
município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
cada um representa em relação ao total de eleitores. (DICA: regra de três para calcular o
percentual de cada voto em relação ao número de eleitores que é 100%, ou seja, X = (brancos
ou nulos ou validos) * 100 / eleitores)
 */

public class Exercicio7 {
    static void main() {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite o numero total de eleitores do municipio");
        int eleitores = var.nextInt();
        System.out.println("Digite o numero de votos brancos");
        int brancos = var.nextInt();
        System.out.println("Digite o numero de votos nulos");
        int nulos = var.nextInt();
        System.out.println("Digite o numero de votos validos");
        int validos = var.nextInt();

        if (brancos + nulos + validos > eleitores){
            System.out.println("O numero não pode ser maior que o numero total de eleitores, tente novamente.");
        } else {
            float percentualBrancos = (float) brancos * 100 / eleitores;
            float percentualnulos = (float) nulos * 100 / eleitores;
            float percentualvalidos = (float) validos * 100 / eleitores;
            System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n",percentualnulos);
            System.out.printf("Percentual de votos validos: %.2f%%\n", percentualvalidos);
        }

    }
}