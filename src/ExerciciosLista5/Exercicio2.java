package ExerciciosLista5;

/*2. (ExeMatriz02) Dada uma matriz M[1..6][1..8] criada randomicamente, criar um vetor C que
contenha em cada posição a quantidade de elementos negativos da linha correspondente de
M. Tamanho de C igual ao número de linhas da matriz.
 */

public class Exercicio2 {
    static void main(String[] args) {

        int matriz[][] = new int[6][8];
        int [] C = new int[6];

        for (int i = 0; i < matriz.length ; i++) {
            int contador = 0;
            for (int j = 0; j < matriz.length ; j++) {
                int aleatorio = (int) (Math.random() * 201) - 100;
                matriz[i][j] = aleatorio;
                if (matriz[i][j] < 0){
                contador++;
                }
            }
            C[i] = contador;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%4d ",matriz[i][j]);

            }
            System.out.println();
        }
        System.out.print(" Vetor C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.printf("%d4 ",C[i]);

        }
    }


}
