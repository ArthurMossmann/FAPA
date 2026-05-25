package ExerciciosLista8.Exercicio2;

public class Conta{
    private int numero;
    private String titular;
    private double saldo;

    public Conta (int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public  void deposito(double valor){
        if (valor > 0){
            this.saldo += valor;
        }
    }
    public void saque(double valor){
        if(valor > 0 && valor <= this.saldo){
        this.saldo -= valor;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}


