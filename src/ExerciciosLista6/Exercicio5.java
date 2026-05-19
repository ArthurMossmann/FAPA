
package ExerciciosLista6;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Valor;



        while(true){
            System.out.println("Digite um valor:");
            Valor = ler.nextInt();

            if(Valor < 0 ){
                break;
            }

            for (int i = 0; i < 10 ; i++) {
                System.out.println(Valor + " x " + i + " = " + (Valor * i));
            }
            System.out.println();

        }
    }

}