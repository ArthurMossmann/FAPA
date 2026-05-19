package ExerciciosLista7.Exercicio4;

public class Veiculo {
    // Atributos privados como no diagrama (-)
    private String numPlaca;
    private String cor;
    private String modelo;
    private Proprietario proprietario;

    // Construtor completo para criar em 1 linha na classe Teste
    public Veiculo(String numPlaca, String cor, String modelo, Proprietario proprietario) {
        this.numPlaca = numPlaca;
        this.cor = cor;
        this.modelo = modelo;
        this.proprietario = proprietario;
    }

    // Métodos públicos (+)
    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return String.format(
                "Veículo: %s | Placa: %s | Cor: %s%n" +
                        "Proprietário: %s | CPF: %s | CNH: %s%n" +
                        "Sexo: %c | Endereço: %s",
                modelo.toUpperCase(),
                numPlaca, cor,
                proprietario.getNome(),
                proprietario.getCpf(), proprietario.getCnh(),
                proprietario.getSexo(), proprietario.getEndereco()
        );
    }
}