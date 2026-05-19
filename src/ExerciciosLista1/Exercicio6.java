package ExerciciosLista1;
import java.util.Scanner;

/*
6. (Lista1_06) Construa um programa em Java para ler (via teclado) uma temperatura em
graus Fahrenheit, calcular e mostrar o valor correspondente em graus Celsius sabendo que
TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão
nos resultados (%.1f)).
 */


public class Exercicio6 {
    static void main(String[] args) {
    Scanner var = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit");
        float Fahrenheit = var.nextFloat();

        float Celsius = conversordetemperaturacelcius(Fahrenheit);

        System.out.printf("""
                A temperatura de %.1f
                A conversao para celsius é de: %.1f
                """
                ,Fahrenheit, Celsius);
    }

    static float conversordetemperaturacelcius(float tempFahrenheit) {
        return 5 * (tempFahrenheit -32)/9;
    }
}
