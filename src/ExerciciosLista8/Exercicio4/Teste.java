package ExerciciosLista8.Exercicio4;

public class Teste {
    static void main(String[] args) {


        Moeda umCentavo = new Moeda(0.01, "Um Centavo");
        Moeda cincoCentavos = new Moeda(0.05, "Cinco Centavos");
        Moeda dezCentavos = new Moeda(0.10, "Dez Centavos");
        Moeda vinteECincoCentavos = new Moeda(0.25, "Vinte e Cinco Centavos");
        Moeda cinquentaCentavos = new Moeda(0.50, "Cinquenta Centavos");
        Moeda umReal = new Moeda(1.00, "Um Real");

        Cofrinho meuCofrinho = new Cofrinho();

        System.out.printf("=== SIMULAÇÃO DO COFRINHO ===%n%n");

        meuCofrinho.adicionar(umReal);
        meuCofrinho.adicionar(cinquentaCentavos);
        meuCofrinho.adicionar(dezCentavos);
        meuCofrinho.adicionar(umReal);

        System.out.printf("%n%s%n%n", meuCofrinho.toString());

        meuCofrinho.remover(cinquentaCentavos);
        meuCofrinho.remover(umCentavo);

        System.out.printf("%n%s%n", meuCofrinho.toString());
    }
}


