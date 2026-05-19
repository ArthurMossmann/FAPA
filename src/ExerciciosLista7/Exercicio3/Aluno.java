package ExerciciosLista7.Exercicio3;

public class Aluno {

    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public static double media(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public static boolean Aprovacao(double media) {
        return media >= 7;
    }

    public static double quantoPrecisa(double media) {
        double quantofalta= (50 - media * 6) / 4;
        return quantofalta;
    }

}
