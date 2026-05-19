package ExerciciosLista7.Exercicio2;

/*
2. (Lista7_OO_exe2) Construa um programa em Java que simule a operação de um CD Player tocando
um CD. Para isso, implemente uma classe chamada CD que conterá três atributos:
• o número de músicas que o CD possui;
• o número da faixa que está tocando no momento (ao iniciar, este valor deve ser colocado em
1, que é o número da primeira música);
• e se o CD Player está tocando uma música no momento ou se está parado ou pausado (o
aparelho sempre inicia parado).
Além destes atributos, o programa deve possuir os seguintes métodos:
• um método que funcione como o botão play, dizendo ao aparelho que deve começar a tocar
a faixa atual;
• um método que funcione como o botão pause, fazendo o aparelho parar de tocar;
• um método que funcione como o botão stop, que faz com que o aparelho pare de tocar e volte
para a faixa 1;
• um método que permite avançar para a próxima faixa (se o CD já estiver na última faixa, deve
ir para a primeira);
• um método que permite retroceder para a faixa anterior (se o CD já estiver na primeira faixa,
deve ir para a última).
• um método que imprima o estado atual do CD (como um Display) sempre que algum método
for chamado.
Ao implementar o programa que use a classe CD, permita ao usuário que informe o número de músicas
do CD. A simulação ocorrerá da seguinte forma:

• crie um objeto a partir da classe CD que será a base da simulação.
• após entrar com o número de músicas(armazene esse valor no objeto que você criou), permita
ao usuário entrar com comandos para o CD Player (monte um menu de opções para isso). Os
comandos serão informados através de números:
o 1 para play
o 2 para pause
o 3 para stop
o 4 para ir para a próxima faixa
o 5 para ir para a faixa anterior
• Para cada comando digitado pelo usuário, chame o método apropriado no objeto que você
criou. O programa irá terminar quando o usuário digitar o comando de número 0 (zero).
 */

public class CD {
    private int numMusicasCD;
    private int faixaAtual;
    private int estado;

    public CD(int total){
        this.estado = 1; // 1 significa "Parado"
        this.faixaAtual = 1;
        this.numMusicasCD = total;
    }

    public void play(){
        // Se estiver Parado (1) ou Pausado (2), vira Tocando (3)
        if (this.estado == 1 || this.estado == 2){
            this.estado = 3;
        }
        System.out.println(this); // Imprime o display na tela
    }

    public void pause() {
        this.estado = 2; // 2 significa "Pausado"
        System.out.println(this);
    }

    public void stop () {
        this.estado = 1; // 1 significa "Parado"
        this.faixaAtual = 1;
        System.out.println(this);
    }

    public void proximafaixa(){
        // Se a faixa atual for menor que o total, avança. Senão, volta para a 1.
        if (faixaAtual < numMusicasCD){
            faixaAtual++;
        } else {
            faixaAtual = 1;
        }
        System.out.println(this);
    }

    public void faixaanterior(){
        if (faixaAtual > 1){
            faixaAtual--;
        } else {
            faixaAtual = numMusicasCD;
        }
        System.out.println(this);
    }

    public int getNumMusicasCD() {
        return numMusicasCD;
    }

    public void setNumMusicasCD(int numMusicasCD) {
        this.numMusicasCD = numMusicasCD;
    }

    public int getFaixaAtual() {
        return faixaAtual;
    }

    public void setEstado(int estado){
        this.estado = estado;
    }

    @Override
    public String toString() {
        // Traduz o número do estado em uma palavra bonita para o display
        String textoEstado = "";
        if (this.estado == 1) textoEstado = "Parado";
        if (this.estado == 2) textoEstado = "Pausado";
        if (this.estado == 3) textoEstado = "Tocando";

        // Monta o texto e retorna para o System.out.println usar
        return "\n--- DISPLAY CD PLAYER ---\n" +
                "Status: " + textoEstado + "\n" +
                "Faixa: " + faixaAtual + " de " + numMusicasCD + "\n" +
                "-------------------------\n";
    }
}

