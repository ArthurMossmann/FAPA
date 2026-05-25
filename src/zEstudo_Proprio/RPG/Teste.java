package zEstudo_Proprio.RPG;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Escolha a classe do personagem:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        opcao = var.nextInt();
        var.nextLine(); // Limpar o buffer do scanner

        Personagem jogador = null;
        Personagem inimigo = null;

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do guerreiro:");
                jogador = new Guerreiro(var.nextLine(),
                        1000,
                        20,
                        5,
                        15,
                        "Espada");
                inimigo = new Mago(
                        "Sombrius",
                        600,
                        15,
                        5,
                        10,
                        100);
                break;
            case 2:
                System.out.println("Digite o nome do mago:");
                jogador = new Mago(var.nextLine(),
                        600,
                        15,
                        5,
                        10,
                        100);
                inimigo = new Guerreiro("Brutus",
                        1000,
                        20,
                        5,
                        15,
                        "Espada");
                break;
        }

        do {
            System.out.println("Escolha a ação:");
            System.out.println("1 - Mostrar status");
            System.out.println("2 - Atacar");
            System.out.println("3 - usar habilidade");
            System.out.println("4 - Sair");
            opcao = var.nextInt();
            var.nextLine();// Limpar o buffer do scanner
            System.out.println();

            switch (opcao) {
                case 1:
                    jogador.mostrarStatus();
                    System.out.println();
                    break;
                case 2:
                    Personagem.atacar(jogador, inimigo);
                    Personagem.atacar(inimigo, jogador);
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    if (jogador instanceof Mago) {
                        ((Mago) jogador).lancarmagia(inimigo);
                        Personagem.atacar(inimigo, jogador);
                        System.out.println();
                    } else if (jogador instanceof Guerreiro) {
                        System.out.println("Guerreiro não tem habilidade especial!");
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (jogador.getVida() > 0 && inimigo.getVida() > 0 && opcao != 4) ;
        if (jogador.getVida() <= 0) {
            System.out.println("Você foi derrotado!");
        } else {
            System.out.println("Você venceu!");
            jogador.setXp(jogador.getXp() + 50);
            System.out.println("Parabéns, você ganhou 50 XP!");
            System.out.printf("XP atual: %.2f%n", jogador.getXp());
            System.out.println();
        }
    }
}