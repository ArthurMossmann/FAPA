package ExerciciosLista6;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int A,B;

        while(true){
            System.out.print("Digite dois valores:");
            A = ler.nextInt();
            B = ler.nextInt();
            if(A==B);{
                break;
            }
        }
        if (A < B){
            System.out.println("Crescente");
        } else {
            System.out.println("Decrescente");
        }
    }
}