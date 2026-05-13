package Simulado;
import java.util.Scanner;

public class Exercicio3Sozinho {
    public void main(String[] args) {
        Scanner var = new Scanner(System.in);

        int[] Vetor = new int[10];

        for (int i = 0; i < Vetor.length ; i++) {
            System.out.println("digite os batimentos cardiacos");
            Vetor[i] = var.nextInt();

        }

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mostrar a Média dos batimentos");
            System.out.println("2 - Mostrar o Maior batimento registrado (Pico)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = var.nextInt();

            switch (opcao){
                case 1:
                double media = calcularmedia(Vetor);
                    System.out.printf("A media de batimentos por minuto e de: %.2f", media);
                    System.out.println();
                    break;
                case 2:
                int pico = pico(Vetor);
                    System.out.printf("O Pico registrado foi de: %d", pico);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Encerando Programa...");
                    break;
                default:
                    System.out.println("opçao Invalida Tente novamente.");
                    System.out.println();
                    break;
            }
        }
        while(opcao != 3);
    }

    public double calcularmedia(int[] vetor) {
        double soma = 0;
        for (int BPM : vetor){
            soma += BPM;
    }
        return soma/ vetor.length;
    }

    static int pico(int[] Vector) {
    int btm = Vector[0];
        for (int BPM : Vector) {
            if (BPM > btm){
                btm = BPM;
            }
        }
        return btm;
    }
}

