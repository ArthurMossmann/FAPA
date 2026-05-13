package Simulado;
import java.util.Scanner;

/*
Um relógio inteligente (smartwatch) voltado para desportistas registra de tempos em tempos os
batimentos cardíacos (BPM) do utilizador. Faça um programa em Java que:
1. Declare, instancie e preencha um vetor de 10 posições de números inteiros,
representando os últimos 10 registros de BPM lidos (inseridos pelo utilizador via teclado).

2. Após o preenchimento, exiba um menu interativo em loop (usando do-while e switch-
case) com as opções:

• 1 - Mostrar a Média dos batimentos
• 2 - Mostrar o Maior batimento registrado (Pico)
• 3 - Sair
3. Regra de Modularização: A lógica matemática das opções 1 e 2 não pode ficar solta no
main. Crie duas funções estáticas (métodos) que recebam o vetor de batimentos como
parâmetro, façam a conta e retornem o resultado para ser impresso dentro do switch.
DICAS PARA A QUESTÃO 3:
• Dados para Teste (O que digitar?): Para simular o relógio corretamente na hora de testar
o seu código, digite valores realistas de BPM (Batimentos Por Minuto). Uma pessoa normal
em repouso tem entre 60 e 100 BPM, e durante exercícios físicos intensos esse valor
costuma variar entre 120 e 180 BPM. Use números dentro desta faixa ao preencher o
vetor!
• Menu Infinito: O seu do-while deve envolver tanto a impressão do menu (os
System.out.println das opções) quanto a leitura da opção digitada e o switch. A condição
do laço deve ser algo como while (opcao != 3);.
• Funções: As suas funções devem ficar do lado de fora do main. A assinatura delas será
parecida com isto: public static double calcularMedia(int[] vetor) { ... }.
 */
public class Exercicio3 {
    static void main() {
        int[] batimentos = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < batimentos.length; i++) {
            System.out.printf("Digite o BPM para o registro %d: ", i + 1);
            batimentos[i] = scanner.nextInt();
        }

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mostrar a Média dos batimentos");
            System.out.println("2 - Mostrar o Maior batimento registrado (Pico)");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double media = calcularmedia(batimentos);
                    System.out.printf("Média dos Batimentos: %.2f BPM%n", media);
                    break;
                case 2:
                    int pico = encontrarPico(batimentos);
                    System.out.printf("Maior Batimento Registrado (Pico): %d BPM%n", pico);
                    break;
                case 3:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        System.out.println("\nRegistros de BPM:");
        for (int i = 0; i < batimentos.length; i++) {
            System.out.printf("Registro %d: %d BPM%n", i + 1, batimentos[i]);
        }

    }
        static double calcularmedia(int[] vetor) {
            int soma = 0;
            for (int bpm : vetor) {
                soma += bpm;
            }
            return (double) soma / vetor.length;

        }
        static int encontrarPico(int[] vetor) {
            int pico = vetor[0];
            for (int bpm : vetor) {
                if (bpm > pico) {
                    pico = bpm;
                }
            }
            return pico;
        }
    }
