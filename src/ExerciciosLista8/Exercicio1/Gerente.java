package ExerciciosLista8.Exercicio1;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente (String nome, String cpf, double salario, String departamento) {
        super (nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double getSalario() {
        return salario * 1.2; // Gerente recebe 20% a mais que o salário base
    }
}
