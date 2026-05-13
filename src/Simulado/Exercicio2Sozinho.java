package Simulado;
import java.util.Scanner;

/*
Uma rede de cinemas quer mapear o perfil do seu público durante os fins de semana para
direcionar melhor as campanhas de marketing. Faça um programa em Java que utilize um laço de
repetição (while ou do-while) para ler continuamente a idade do cliente e o código do bilhete
comprado (1 - Padrão, 2 - 3D, 3 - VIP). O programa deve parar de solicitar novos dados e encerrar
o laço imediatamente quando o utilizador digitar uma idade negativa (ex: -1). Ao final da
execução, o programa deverá exibir obrigatoriamente: a) O total de bilhetes vendidos naquele
dia. b) A média de idade dos clientes do cinema. c) A quantidade de clientes que compraram o
bilhete VIP (código 3).
 */



public class Exercicio2Sozinho {
    public static void main() {
        Scanner var = new Scanner(System.in);

        int totaldecVIP = 0;
        int totaldebilhetes = 0;
        int somaidade = 0;


        while (true){
            System.out.println("Digite sua idade: ");
            int idade = var.nextInt();
            if (idade < 0) {
                break;
            }
            System.out.println("Digite o código do bilhete comprado (1 - Padrão, 2 - 3D, 3 - VIP):");
            int codigoBilhete = var.nextInt();

            totaldebilhetes++;
            somaidade += idade;
            if (codigoBilhete == 3){
                totaldecVIP++;
            }
        }
        double mediaidade;

        if (totaldebilhetes > 0){
            mediaidade = (double) somaidade /totaldebilhetes;
        }else {
            mediaidade = 0;
        }

        System.out.printf("Total de bilhetes vendidos Hoje: %d%n", totaldebilhetes);
        System.out.printf("Média de idade dos clientes: %.2f%n", mediaidade);
        System.out.printf("Quantidade de clientes que compraram bilhete VIP: %d%n", totaldecVIP);


    }
}
