package ExerciciosLista7.Exercicio2;
import java.util.Scanner;

public class TesteCD {
    static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Digite o número de músicas do CD: ");
        int musicas = var.nextInt();

        CD CDPlayer = new CD(musicas);
        System.out.println(CDPlayer);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println(
                    "MENU:\n" +
                            " 1-Play\n" +
                            " 2-Pause\n" +
                            " 3-Stop\n" +
                            " 4-Próxima\n" +
                            " 5-Anterior\n" +
                            " 0-Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = var.nextInt();

            switch (opcao){
                case 1:
                    CDPlayer.play();
                    break;
                case 2:
                    CDPlayer.pause();
                    break;
                case 3:
                    CDPlayer.stop();
                    break;
                case 4:
                    CDPlayer.proximafaixa();
                    break;
                case 5:
                    CDPlayer.faixaanterior();
                    break;
                case 0:
                    System.out.println("saindo ...");
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");

            }
        }
    }
}

