package Simulado;
import java.util.Scanner;

/*
Uma rede de cinemas quer mapear o perfil do seu público durante os fins de semana para
adirecionar melhor as cmpanhas de marketing. Faça um programa em Java que utilize um laço de
repetição (while ou do-while) para ler continuamente a idade do cliente e o código do bilhete
comprado (1 - Padrão, 2 - 3D, 3 - VIP). O programa deve parar de solicitar novos dados e encerrar
o laço imediatamente quando o utilizador digitar uma idade negativa (ex: -1). Ao final da
execução, o programa deverá exibir obrigatoriamente: a) O total de bilhetes vendidos naquele
dia. b) A média de idade dos clientes do cinema. c) A quantidade de clientes que compraram o
bilhete VIP (código 3).

DICAS PARA A QUESTÃO 2:
• Variáveis de Controle: Declare variáveis inicializadas em zero antes do laço iniciar. Você
precisará de um "contador" (ex: totalClientes++) e de um "acumulador" (ex: somaIdades
+= idade).
• O problema: Cuidado para não contabilizar a idade negativa que encerra o programa! Se
o utilgizador digitar -1, o prorama deve usar um comando break ou tratar com um if para
sair do laço antes de somar essa idade falsa aos cálculos.
• Divisão Segura: Ao calcular a média de idade, force o resultado a ter casas decimais
fazendo um "cast" (conversão explícita): double media = (double) somaIdades /
totalClientes;. Proteja a divisão com um if (totalClientes > 0) para evitar o erro de divisão
por zero.
 */

public class Exercicio2 {
    static void main() {

            int totalClientes = 0;
            int somaIdades = 0;
            int clientesVIP = 0;

            while (true) {
                System.out.println("Digite a idade do cliente (ou um número negativo para encerrar):");
                int idade = new Scanner(System.in).nextInt();

                if (idade < 0) {
                    break; // Encerra o laco se a idade for negativa!!!!!!!!!!!!!!!!!!!!!!!!!!
                }

                System.out.println("Digite o código do bilhete comprado (1 - Padrão, 2 - 3D, 3 - VIP):");
                int codigoBilhete = new Scanner(System.in).nextInt();

                totalClientes++;
                somaIdades += idade;

                if (codigoBilhete == 3) {
                    clientesVIP++;
                }
            }

        double mediaIdade = totalClientes > 0 ? (double) somaIdades / totalClientes : 0;

            System.out.printf("Total de bilhetes vendidos Hoje: %d%n", totalClientes);
            System.out.printf("Média de idade dos clientes: %.2f%n", mediaIdade);
            System.out.printf("Quantidade de clientes que compraram bilhete VIP: %d%n", clientesVIP);
    }
}
