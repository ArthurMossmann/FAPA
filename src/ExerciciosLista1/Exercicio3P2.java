package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")
/*
3.1. (Lista1_03_1) A mesma especificação do exercício anterior (Lista1_03) contudo
agora usando números do tipo float (com duas casas decimas depois da vírgula (%.2f)).
 */

public class Exercicio3P2 {
    static void main(String[] args) {
    Scanner var = new Scanner(System.in);

    System.out.println("digite o primeiro numero: ");
    float n1 = var.nextFloat();

    System.out.println("digitte o segundo numero: ");
    float n2 = var.nextFloat();

    System.out.println("digitte o terceiro numero: ");
    float n3 = var.nextFloat();

    System.out.println("digitte o quarto numero: ");
    float n4 = var.nextFloat();

    float resultado = calculodamedia(n1,n2,n3,n4);

    System.out.printf("""
    A nota do 1 Bimestre é: %.2f
    A nota do 2 Bimestre é: %.2f
    A nota do 3 Bimestre é: %.2f
    A nota do 4 Bimestre é: %.2f
    A media Final foi de: %.2f
    """, n1, n2, n3, n4, resultado);
}

    static float calculodamedia(float A, float B, float C, float D) {
        return (A+B+C+D) / 4;
    }

}
