package ExerciciosLista7.Exercicio1;

/*
1. (Lista7_OO_exe1) Crie uma classe chamada Quadrado que será um modelo para construção de
objetos que armazenem dados de quadrados. Esta classe conterá um único atributo que armazenará
o tamanho do lado do quadrado em centímetros. Além deste atributo, a classe conterá três métodos:
• um que calcule e devolva a área do quadrado (dado por LADO2
);
• outro que calcule e devolva o perímetro do quadrado (4 * LADO);
• e outro que calcule e devolva o valor da diagonal do quadrado (LADO * √2).
Escreva um programa para simulação que receba o valor do lado de um quadrado, crie um objeto da
classe Quadrado com este valor de lado, e mostre a área, o perímetro e a diagonal deste quadrado,
usando os métodos do objeto criado.
 */

public class Quadrado {

    private double lado;



    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;

    }

    static double Area(double Lado) {
        double Area = Lado*Lado;
        return Area;
    }

    static double Perimetro(double Lado) {
        double Perimetro = 4 * Lado;
        return Perimetro;
    }

    static double ValorDaDiagonal(double Lado) {
        double Diagonal = Lado * Math.sqrt(2);
        return Diagonal;
    }
}
