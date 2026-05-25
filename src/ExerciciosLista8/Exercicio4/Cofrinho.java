package ExerciciosLista8.Exercicio4;
import java.util.ArrayList;

public class Cofrinho {
    private ArrayList <Moeda> moedas;

    public Cofrinho (){
        this.moedas = new ArrayList<>();
    }

    public void adicionar(Moeda moeda){
        this.moedas.add(moeda);
        System.out.printf("Moeda de %s Adicionada!%n",moeda.getNome());
    }

    public boolean remover(Moeda moeda) {
        if (this.moedas.remove(moeda)) {
            System.out.printf("Moeda de %s removida!%n", moeda.getNome());
            return true;
        }
        System.out.printf("Moeda de %s não encontrada no cofrinho!%n", moeda.getNome());
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (Moeda m : this.moedas) {
            total += m.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        return String.format("Status do Cofrinho: %d moeda(s) armazenada(s) | Valor Total: R$ %.2f",
                this.moedas.size(), this.calcularTotal());
    }
}
