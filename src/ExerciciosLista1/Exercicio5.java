package ExerciciosLista1;
import java.util.Scanner;

/*
5. (Lista1_05) Construa um programa em Java para ler (via teclado) o raio de um círculo,
calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)).
Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).
 */

public class Exercicio5 {
    static void main(String[] args) {
    Scanner var = new Scanner(System.in);

        System.out.println("Digite o valor do raio do circulo:");
        float raio = var.nextFloat();

       float area = calculodocirculo(raio);

        System.out.printf("""
                o raio de: %.2f
                valor da Area é: %.2f
                """
                ,raio,area);
    }

    static float calculodocirculo(float r) {
        float PI = 3.141592f;
        return (PI * (r * r));
    }
}
