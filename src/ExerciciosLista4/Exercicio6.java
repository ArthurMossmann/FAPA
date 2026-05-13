package ExerciciosLista4;

public class Exercicio6 {
    public static void main(String[] args) {

        int[] vetor = {-1,2,-3,4,-5,6,-7,8,-9,10};
        for (int i = 0; i < 10; i++) {
            if (vetor[i]> 0){
                System.out.println("valor: " + vetor[i] + " na posicao: " + i);
            }
        }


    }
}