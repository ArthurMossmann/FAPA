package ExerciciosLista8.Exercicio3;

public class Teste {
    static void main(String[] args) {
        FuncionarioCLT fClt = new FuncionarioCLT(
                "Lucas",
                "123.456.789-00",
                3500.00
        );

        FuncionarioHosrista fHorista = new FuncionarioHosrista(
                "Arthur",
                "052-362-720-33",
                40,
                75.00
        );

        System.out.printf("=== FOLHA DE PAGAMENTO ===%n%n%n" +
                        "--- Funcionário CLT ---%n" +
                        "Nome: %s%n" +
                        "CPF: %s%n" +
                        "Salário Mensal: R$ %.2f%n" +
                        "Rendimentos R$: R$ %.2f%n",
                fClt.getNome(),
                fClt.getCPF(),
                fClt.getSalarioMensal(),
                fClt.calcularrendimentos()
        );

        System.out.printf("%n--- Funcionário Horista ---%n" +
                        "Nome: %s%n" +
                        "CPF: %s%n" +
                        "Horas Trabalhadas: %d%n" +
                        "Salário Por Hora: R$ %.2f%n" +
                        "Rendimentos R$: R$ %.2f%n",
                fHorista.getNome(),
                fHorista.getCPF(),
                fHorista.getHorasTrabalhadas(),
                fHorista.getSalarioHoras(),
                fHorista.calcularrendimentos()
        );
    }
}