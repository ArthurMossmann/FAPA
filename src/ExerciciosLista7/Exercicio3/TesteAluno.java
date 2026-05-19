package ExerciciosLista7.Exercicio3;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("=== Cadastro de Aluno ===");

        System.out.println("Digite a matrícula do aluno:");
        aluno.setMatricula(var.nextInt());
        var.nextLine();

        System.out.println("Digite o nome do aluno:");
        aluno.setNome(var.nextLine());

        System.out.println("Digite a primeira nota do aluno:");
        aluno.setNota1(var.nextDouble());

        System.out.println("Digite a segunda nota do aluno:");
        aluno.setNota2(var.nextDouble());

        System.out.println("=== Informações do Aluno ===");
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());

        double media = Aluno.media(aluno.getNota1(), aluno.getNota2());
        System.out.println("Média: " + media);

        if (Aluno.Aprovacao(media)) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            double quantofalta = Aluno.quantoPrecisa(media);
            System.out.println("Infelizmente, você foi reprovado.");
            System.out.println("Você precisa de " + quantofalta + " pontos para ser aprovado.");
        }
        System.out.println("=========================================");
    }
}
