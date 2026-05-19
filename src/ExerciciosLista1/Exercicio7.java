package ExerciciosLista1;
import java.util.Scanner;
@SuppressWarnings("unused")

/*
7. (Lista1_07) Construa um programa em Java que leia (via teclado) um comprimento em
polegadas, calcule e mostre o comprimento correspondente em milímetros, considerando
que 1 polegada equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão
nos resultados (%.1f)).
 */


public class Exercicio7 {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("escreva o valor q deseja converter para milimitros: ");
        float polegadas = var.nextFloat();

        float milimetross = conversordepolegadas(polegadas);

        System.out.printf("\n%.1f polegadas equivalem a %.1f milímetros.\n", polegadas, milimetross);

    }

    static float conversordepolegadas(float A) {
        return A * 25.4f;


    }
}