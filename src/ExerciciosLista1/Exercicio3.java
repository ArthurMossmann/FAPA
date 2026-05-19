package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")
/*3. (Lista1_03) Construa um programa em Java para ler (via teclado) quatro números do tipo
inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
com duas casas decimais depois da vírgula (%.2f).
 */

public class Exercicio3 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("digite o primeiro numero: ");
        int n1 = var.nextInt();

        System.out.println("digitte o segundo numero: ");
        int n2 = var.nextInt();

        System.out.println("digitte o terceiro numero: ");
        int n3 = var.nextInt();

        System.out.println("digitte o quarto numero: ");
        int n4 = var.nextInt();

        float resultado = calculodamedia(n1,n2,n3,n4);

        System.out.printf("""
    A nota do 1 Bimestre é: %d
    A nota do 2 Bimestre é: %d
    A nota do 3 Bimestre é: %d
    A nota do 4 Bimestre é: %d
    A media Final foi de: %.2f
    """, n1, n2, n3, n4, resultado);
    }

    static float calculodamedia(int A, int B, int C, int D) {
        return (float)(A+B+C+D) / 4;
    }

}