package ExerciciosLista4;

public class Exercicio5 {
    public static void main(String[] args) {

        int[] A = {2, 4, 6, 8, 10, 3, 5, 7, 9, 1};
        int[] B = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] C = new int[10];

        for (int i = 0; i < 10; i++) {
            C[i] = A[i] * B[i];
        }
        System.out.println("indice |    A  |    B  |    C  ");
        System.out.println("-------|-------|-------|-------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("  %02d   |  %3d  |  %3d  |  %3d%n", i, A[i], B[i], C[i]);
        }
    }
}