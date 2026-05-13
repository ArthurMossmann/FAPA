package ExerciciosLista5;
import Lib.Funcoes;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);
        System.out.println("digite a quantidade do produto: ");
        int quantidade = var.nextInt();

        if (quantidade > 0){
            double precoUnitario = (quantidade >= 12) ? 0.50 : 1;
            double valorTotal = quantidade * precoUnitario;
            System.out.printf("Valor total da compra: R$ %.2f\n", valorTotal);
        }

    }
}
