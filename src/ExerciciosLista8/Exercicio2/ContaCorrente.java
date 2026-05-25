package ExerciciosLista8.Exercicio2;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    @Override
    public void saque(double valor){
        double valorMaximoDisponivel = this.getSaldo() + this.limite;

        if (valor > 0 && valor <= valorMaximoDisponivel ){
            double novoSaldo = this.getSaldo() - valor;
            this.setSaldo(novoSaldo);
        } else {
            System.out.println("Operação não realizada. Saldo insuficiente na Conta. \n");
        }
    }

    public double getLimite(){
        if (this.getSaldo() < 0 ) {
            return this.limite + this.getSaldo(); // Limite disponível é o limite total menos o valor negativo do saldo
        } else {
            return this.limite; // Se o saldo for positivo, o limite disponível é o limite total
        }
    }

    @Override
    public String toString() {
        return "-------------------------------------\n" +
                "STATUS DA CONTA CORRENTE \n" +
                "Titular: " + getTitular() + "\n" +
                "Saldo: R$ " + getSaldo() + "\n" +
                "Limite: R$ " + (getSaldo() + this.limite) + "\n" +
                "-------------------------------------\n";
    }
}