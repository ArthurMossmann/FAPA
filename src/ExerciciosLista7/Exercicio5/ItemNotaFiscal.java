package ExerciciosLista7.Exercicio5;

public class ItemNotaFiscal {

    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private double aliquotaIcms;

    public ItemNotaFiscal(String descricao, double valorUnitario, int quantidade, double aliquotaIcms) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
        this.aliquotaIcms = aliquotaIcms;
    }

    public double calcularValorTotal() {
        return valorUnitario * quantidade;
    }

    public double calcularIcms() {
        return calcularValorTotal() * (aliquotaIcms / 100);
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getAliquotaIcms() {
        return aliquotaIcms;
    }

    public void setAliquotaIcms(double aliquotaIcms) {
        this.aliquotaIcms = aliquotaIcms;
    }

    public void mostrar(int numeroItem) {
        System.out.printf("  Item %-3d  %-20s  %5d     %12.2f   %12.2f   %12.2f%n",
                numeroItem,
                descricao,
                quantidade,
                valorUnitario,
                calcularValorTotal(),
                calcularIcms());
    }
}