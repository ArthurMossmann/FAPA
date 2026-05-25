package zEstudo_Proprio.RPG;

public class Personagem {
    private String nome;
    private int vida;
    private int nivel;
    private int defesa;
    private float xp;


    public Personagem (String nome, int vida, int nivel, int defesa){
        this.nome = nome;
        this.vida = vida;
        this.nivel = nivel;
        this.defesa= defesa;
        this.xp = 0;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void mostrarStatus() {
        System.out.println("======================================================");
        System.out.println("Status do personagem:");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Vida: %d%n", vida);
        System.out.printf("Nível: %d%n", nivel);
        System.out.printf("Defesa: %d%n", defesa);
        System.out.printf("XP: %.2f%n", xp);
        System.out.println("======================================================");
    }

    public static void atacar(Personagem atacante, Personagem alvo) {
        System.out.println("Atacando o personagem " + alvo.nome);
        int dano = atacante.nivel * 10 - alvo.defesa;
        if (dano <= 0){
            dano = 1;
        }else {
            System.out.println("======================================================");
            System.out.println("Dano bruto: " + (atacante.nivel * 10));
             System.out.println("Defesa do alvo: " + alvo.defesa);
        }
        System.out.printf("Dano causado: %d%n", dano);
        alvo.vida -= dano;
        if (alvo.vida < 0){
            alvo.vida = 0;
        }
        System.out.printf("Vida restante do alvo: %d%n", alvo.vida);
        System.out.println("======================================================");
    }
}
