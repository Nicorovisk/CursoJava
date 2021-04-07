package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;
    private int delta;

    protected Carro(int velocidadeMaxima, int delta){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
        this.delta = delta;
    }

    public void acelerar(int vezes){
        if(velocidadeAtual + (delta *  vezes) >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += (delta * vezes);
        }

    }

    public void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
        else{
            velocidadeAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
