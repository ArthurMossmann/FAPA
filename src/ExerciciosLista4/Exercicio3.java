package ExerciciosLista4;

public class Exercicio3 {
    public static void main(String[] args) {

        int tamanhoVetor = 10;

        int[] vetorB = new int[tamanhoVetor];

        for (int i = 0; i < tamanhoVetor; i++) {
            if (i % 2 == 0){
                vetorB[i] = 20;}
            else{
                vetorB[i] = 10;
            }
            System.out.println("Vetor[" + i + "] = " + vetorB[i]);
        }
    }
}