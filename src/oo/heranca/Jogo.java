package oo.heranca;

public class Jogo {

    public static void main(String[] args){
        Jogador j1 = new Jogador();
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.LESTE);

        System.out.println("X: " + j1.x + " Y: " + j1.y);
    }
}
