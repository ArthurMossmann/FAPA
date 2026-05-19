package ExerciciosLista7.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {


        Proprietario propri1 = new Proprietario("Arthur", "Rua A, 94", 'M', "05236272033", "515180833");
        Proprietario propri2 = new Proprietario("Maria", "Av B, 500", 'F', "11122233344", "987654321");

        List<Veiculo> lista = new ArrayList<>();

        lista.add(new Veiculo("ABC-1234", "Prata", "Fiesta", propri1));
        lista.add(new Veiculo("XYZ-5678", "Preto", "SUV", propri1));
        lista.add(new Veiculo("MNO-9012", "Branco", "Hatch", propri1));
        lista.add(new Veiculo("JKL-3456", "Vermelho", "Picape", propri2));
        lista.add(new Veiculo("QWE-7890", "Azul", "Moto", propri2));

        System.out.println("\n=== SYSTEMA DE CADASTRO DE TRÂNSITO ===\n");
        for (Veiculo v : lista) {
            System.out.println(v);
            System.out.println();
        }
    }
}