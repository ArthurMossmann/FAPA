package ExerciciosLista8.Exercicio3;

public class FuncionarioCLT extends CFuncionario {
    private double salarioMensal;

public FuncionarioCLT(String nome, String CPF, Double salarioMensal) {
        super(nome, CPF);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularrendimentos(){
    return this.salarioMensal;
    }


    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}
