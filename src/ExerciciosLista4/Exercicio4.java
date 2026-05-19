package ExerciciosLista4;

public class Exercicio4 {
    public static void main(String[] args) {

        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        int CTP = 0;

        System.out.println("Numeros de dos vetores");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i] + " ");
            if (vetor[i] % 2 == 0) {
                CTP++;
            }
        }
        System.out.println("os numeros pares do vetores sao: \n" + CTP);
    }
}