package ExerciciosLista2;
import java.util.Scanner;

/*
6. (ExeSelecao06.java) Construa um programa em Java para ler três valores que
representam três segmentos de reta. Verificar se com esses segmentos é possível compor
um triângulo e mostrar uma mensagem dizendo se é ou não possível. (DICA: Usar if/else e
operador lógico &&. Regra para ser um triângulo: (A < B + C) e (B < A + C) e (C < A + B), OU
SEJA, todos os lados devem ser menores que a soma dos outros dois lados)
 */

public class Exercicio6 {
    static void main() {

        Scanner var = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro segmento de reta:");
        float A = var.nextFloat();
        System.out.println("Digite o valor do segundo segmento de reta:");
        float B = var.nextFloat();
        System.out.println("Digite o valor do terceiro segmento de reta:");
        float C = var.nextFloat();

        if ((A < B + C) && (B < A + C) && (C < A + B)){
            System.out.println("É possível formar um triângulo com os segmentos de reta informados.");
        } else {
            System.out.println("Não é possível formar um triângulo com os segmentos de reta informados.");
        }
    }

}