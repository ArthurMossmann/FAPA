package ExerciciosLista4;

public class Exercicio1 {
    public static void main(String[] args) {

        int tamanhoVetor = 10;

        int[] vetor1;
        vetor1 = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            vetor1[i] = 30;
            System.out.println("X[" + i + "] = " + vetor1[i] );

        }
    }
}