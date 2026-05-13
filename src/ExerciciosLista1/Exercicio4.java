package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")

/*
4. (Lista1_04) Construa um programa em Java que leia um número do tipo “inteiro” (via
teclado) e o guarde numa variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadrado
de X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produto
de X pela metade de X.
 */


public class Exercicio4 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("digite um Valor:");
        int X = var.nextInt();
        System.out.printf("valor de X é: %d\n", X);

        int quadrado = aoquadrado(X);

        System.out.printf("X² é: %d\n",quadrado);

        int resto = restodadivisao(X);

        System.out.printf("X/3 o resto da divisao é: %d\n",resto);

        float metade = metadesdeX(X);

        System.out.printf("a metade de %d é: %.2f\n",X, metade);

        float produto = calcularprodutopelametade(X);

        System.out.printf("O resultado do produto pela metade de %d e de: %.2f",X, produto);
    }

    static int aoquadrado (int A) {
        return A*A;
    }

    static int restodadivisao(int A) {
        return  A % 3;
    }

    static float metadesdeX(float A) {
        return A/2;
    }

    static float calcularprodutopelametade(float A) {
        return (A*A)/2;
    }
}