package ExerciciosLista6;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int Numero;

        while(true){
            System.out.println("Digite um Número:");
            Numero = ler.nextInt();

            if(Numero == 0){
                break;
            }
            int Resultado = 1;

            for (int i = 1; i <= Numero ; i++) {
                Resultado *= i;
                System.out.println("Multiplicaçao ate " + i + ": " + Resultado);
            }
            System.out.println();
        }
    }
}