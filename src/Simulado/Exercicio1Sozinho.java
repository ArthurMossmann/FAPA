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

public class Exercicio1Sozinho {
    public void main(String[] args) {

        Scanner var = new Scanner(System.in);

        double desing = lernota(var,"Desing");
        double usabilidade = lernota(var,"usabilidade");
        double custobeneficio = lernota(var,"custobeneficio");


        double mediaponderada = ((desing * 2) + (usabilidade * 4) + (custobeneficio * 4)) / 10;

        System.out.printf("A media do produto é: %.2f\n", mediaponderada);

        if (mediaponderada >= 8.0) {
            System.out.println("Produto Exelente");
        } else {
            System.out.println("Produto Regular");
        }

    }

    static double lernota(Scanner var, String categoria) {
        double nota;
        while(true) {
            System.out.printf("Digite a nota de 0 a 10 do %s: ", categoria);
            nota = var.nextDouble();

            if (nota >= 0 && nota <= 10) {
            return nota;
            } else {
                System.out.println("Numero invalido Somente de 0 A 10 podendo ter numero quebrado");
            }
        }
    }
}
