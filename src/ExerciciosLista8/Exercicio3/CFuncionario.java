package ExerciciosLista8.Exercicio3;

public abstract class CFuncionario {
    private String nome;
    private String cpf;

    public CFuncionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public abstract double calcularrendimentos();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = cpf;
    }
}
