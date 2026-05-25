package ExerciciosLista8.Exercicio3;

import ExerciciosLista8.Exercicio1.Funcionario;

public class FuncionarioHosrista extends CFuncionario{
    private double salarioHoras;
    private int horasTrabalhadas;

    public FuncionarioHosrista(String nome, String CPF, int horasTrabalhadas, double salarioHoras){
        super(nome,CPF);
        this.salarioHoras = salarioHoras;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularrendimentos(){
        return this.horasTrabalhadas * salarioHoras;
    }
    public double getSalarioHoras() {
        return salarioHoras;
    }

    public void setSalarioHoras(double salarioHoras) {
        this.salarioHoras = salarioHoras;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
