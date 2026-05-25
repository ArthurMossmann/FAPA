package zEstudo_Proprio.RPG;

public class Mago extends Personagem{
    private int forca;
    private int mana;

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    public Mago(String nome, int vida, int defesa, int nivel, int forca, int mana) {
        super(nome, vida, nivel, defesa);
        this.forca = forca;
        this.mana = mana;
    }

    public void lancarmagia(Personagem alvo) {
        int dano;
        if (mana > 0){
            dano = getNivel() * 10 - alvo.getDefesa();
            this.mana -= 20;
            if (dano <= 0){
                dano = 1;
            }
            int vidaRestante = alvo.getVida()- dano;
            if (vidaRestante < 0){
                vidaRestante = 0;
            }
            alvo.setVida(vidaRestante);
            System.out.println("======================================================");
            System.out.printf("%s lançou uma magia em %s causando %d de dano!%n", this.getNome(), alvo.getNome(), dano);
            System.out.printf("Mana restante de %s: %d%n", this.getNome(), this.mana);
            System.out.printf("Vida restante de %s: %d%n", alvo.getNome(), alvo.getVida());
            System.out.println("======================================================");
        }
        else {
            System.out.println("======================================================");
            System.out.printf("%s tentou lançar uma magia, mas não tem mana suficiente!%n", this.getNome());
            System.out.println("======================================================");
        }
    }

    @Override
    public void mostrarStatus() {
        super.mostrarStatus();
        System.out.printf("Força: %d%n", forca);
        System.out.printf("Mana: %d%n", mana);
    }
}
