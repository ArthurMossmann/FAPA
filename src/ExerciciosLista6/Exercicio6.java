package ExerciciosLista6;

public class Exercicio6 {
    public static void main(String[] args) {

        int Contador = 0;
        int Numero = 101;

        while (Contador < 50) {
            boolean primo = true;

            for (int i = 2; i <= Math.sqrt(Numero); i++) {
                if (Numero % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(Numero);
                Contador++;
            }

            Numero++;
        }
    }
}