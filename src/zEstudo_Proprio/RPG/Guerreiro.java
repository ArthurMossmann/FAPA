package zEstudo_Proprio.RPG;

public class Guerreiro extends Personagem {
    private int forca;
    private String arma;

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public Guerreiro(String nome, int vida, int defesa, int nivel, int forca, String arma) {
        super(nome, vida, nivel, defesa);
        this.forca = forca;
        this.arma = arma;
    }

    @Override
    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.printf("Força: %d%n", forca);
        System.out.printf("Arma: %s%n", arma);


    }
}
