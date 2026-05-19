package ExerciciosLista7.Exercicio5;

public class NotaFiscal {
    private ItemNotaFiscal item1;
    private ItemNotaFiscal item2;
    private ItemNotaFiscal item3;

    public NotaFiscal ( ItemNotaFiscal item1, ItemNotaFiscal item2, ItemNotaFiscal item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public double calcularValorTotal() {
        return item1.calcularValorTotal() + item2.calcularValorTotal() + item3.calcularValorTotal();
    }

    private double calcularTotalIcms() {
        return item1.calcularIcms() + item2.calcularIcms() + item3.calcularIcms();
    }
    public void mostrar() {
        System.out.println("=".repeat(100));
        System.out.printf("%40s%n", "NOTA FISCAL");
        System.out.println("=".repeat(100));
        System.out.printf("  %-9s %-20s  %5s     %12s   %12s   %12s%n",
                "Item", "Descrição", "Qtd", "Unit (R$)", "Total (R$)", "ICMS (R$)");
        System.out.println("-".repeat(100));
        item1.mostrar(1);
        item2.mostrar(2);
        item3.mostrar(3);
        System.out.println("-".repeat(100));
        System.out.printf("%55s %12.2f%n", "Total (R$):", calcularValorTotal());
        System.out.printf("%55s %12.2f%n", "ICMS  (R$):", calcularTotalIcms());
        System.out.println("=".repeat(100));
    }
}
