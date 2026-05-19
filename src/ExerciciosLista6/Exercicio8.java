package ExerciciosLista6;
import java.util.Scanner;


public class Exercicio8 {
    public static void main(String[] args) {
        Scanner var =new Scanner(System.in);

        char sexo;
        int idade;

        int somaM = 0, contadorM = 0;
        int somaF = 0, contadorF = 0;

        while (true) {
            System.out.print("Digite o sexo (M/F): ");
            sexo = var.next().toUpperCase().charAt(0);

            if (sexo != 'M' && sexo != 'F') {
                break;
            }

            System.out.print("Digite a idade: ");
            idade = var.nextInt();

            if (sexo == 'M') {
                somaM += idade;
                contadorM++;
            } else {
                somaF += idade;
                contadorF++;
            }
        }

        if (contadorM > 0) {
            System.out.println("Média idade homens: " + (somaM / (double) contadorM));
        } else {
            System.out.println("Nenhum homem informado.");
        }

        if (contadorF > 0) {
            System.out.println("Média idade mulheres: " + (somaF / (double) contadorF));
        } else {
            System.out.println("Nenhuma mulher informada.");
        }

    }
}