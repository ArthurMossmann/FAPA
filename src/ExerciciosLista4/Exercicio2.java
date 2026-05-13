package ExerciciosLista4;

public class Exercicio2 {
    public static void main(String[] args) {

        int tamanhoVetor = 10;

        int[] A;
        A = new int[tamanhoVetor];

        for (int i = 0; i < 10; i++){
            A[i] = (i * 10) + 10;
        }

        for (int i = 0; i < tamanhoVetor; i++) {
            A[i] = (i * 10) + 10;
            System.out.println("A[" + i + "] = " + A[i]);
        }
    }
}