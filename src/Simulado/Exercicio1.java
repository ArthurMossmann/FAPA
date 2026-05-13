package Simulado;
import java.util.Scanner;

/*
Um e-commerce de tecnologia quer criar um selo de qualidade para os seus produtos. A
classificação baseia-se na avaliação dos utilizadores em três categorias (com notas decimais de 0
a 10): Design, Usabilidade e Custo-Benefício. A empresa considera a Usabilidade e o Custo-
Benefício mais importantes que o Design. Faça um programa em Java que leia estas três notas

(double) inseridas pelo utilizador via teclado. O programa deve calcular a média ponderada
sabendo que: o Design tem peso 2, a Usabilidade tem peso 4 e o Custo-Benefício tem peso 4. Ao
final, imprima a média ponderada formatada com duas casas decimais e a mensagem: "Produto
Excelente" se a média for maior ou igual a 8.0, ou "Produto Regular" se for menor que 8.0.
 */

import java.util.Scanner;

public class Exercicio1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota de Design (0 a 10):");
        double design = scanner.nextDouble();
        System.out.println("Digite a nota de Usabilidade (0 a 10):");
        double usabilidade = scanner.nextDouble();
        System.out.println("Digite a nota de Custo-Benefício (0 a 10);");
        double custoBeneficio = scanner.nextDouble();

        double mediaPonderada = (design * 2 + usabilidade * 4 + custoBeneficio * 4) / 10;

        System.out.printf("Média Ponderada: %.2f%n", mediaPonderada);

        if (mediaPonderada >= 8.0) {
            System.out.println("Produto Excelente");
        } else {
            System.out.println("Produto Regular");
        }
    }
}
