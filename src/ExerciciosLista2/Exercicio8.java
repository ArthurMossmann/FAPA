package ExerciciosLista2;
import java.util.Scanner;

/*
8. (ExeSelecao8.java) Construa um programa em Java para ler três valores para os lados de
um triângulo: A, B e C. Verificar se os lados fornecidos formam realmente um triângulo. Se
formar, deve ser indicado o tipo de triângulo: isósceles, escaleno ou equilátero. Para verificar
se os lados fornecidos formam um triângulo: A < B + C e B < A + C e C < A + B. Triângulo
isósceles: possui dois lados iguais (A=B ou A=C ou B=C). Triângulo escaleno: possui todos os

lados diferentes (A<>B e B<>C e A<>C). Triângulo equilátero: possui todos os lados iguais (A=B
e B=C). (DICA: utilizar “if-else” como estrutura de seleção e o operador lógico &&)
 */


public class Exercicio8 {
    static void main() {

        Scanner var = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro lado do triângulo:");
        float A = var.nextFloat();
        System.out.println("Digite o valor do segundo lado do triângulo:");
        float B = var.nextFloat();
        System.out.println("Digite o valor do terceiro lado do triângulo:");
        float C = var.nextFloat();

        if ((A < B + C) && (B < A + C) && (C < A + B)){
            System.out.println("Os lados informados formam um triângulo.");
            if ((A == B) && (B == C)){
                System.out.println("O triângulo é equilátero.");
            } else if ((A != B) && (B != C) && (A != C)) {
                System.out.println("O triângulo é escaleno.");
            } else if ((A==B) || (A==C) || (B==C)) {
                System.out.println("O triângulo é isósceles.");
            }
        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }
    }
}
