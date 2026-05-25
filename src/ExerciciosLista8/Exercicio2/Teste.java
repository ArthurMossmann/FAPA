package ExerciciosLista8.Exercicio2;

public class Teste {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(
                1,
                "TitularCC1",
                1000.0,
                500.0);

        System.out.println("<< -- Estado inicial da Conta Corrente -- >>");
        System.out.println(cc);

        System.out.println("--> Deposito de R$ 100.00");
        cc.deposito(100.0);
        System.out.println(cc);

        System.out.println("--> Saque de R$ 1000.00");
        cc.saque(1000.0);
        System.out.println(cc);

        System.out.println("--> Saque de R$ 750.00");
        cc.saque(750.0);
        System.out.println(cc);

        System.out.println("--> Saque de R$ 350.00");
        cc.saque(350.0);
        System.out.println(cc);

        System.out.println("--> Saque de R$ 100.00");
        cc.saque(100.0);
        System.out.println(cc);

        System.out.println("--> Saque de R$ 150.00");
        cc.saque(150.0);
        System.out.println(cc);

        System.out.println("--> Saque de R$ 50.00");
        cc.saque(50.0);
        System.out.println(cc);

        System.out.println("--> Deposito de R$ 100.00");
        cc.deposito(100.0);
        System.out.println(cc);
    }
}
