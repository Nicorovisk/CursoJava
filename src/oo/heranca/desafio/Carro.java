package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    public int velocidadeAtual = 0;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(int vezes, int aceleracao){
        if(velocidadeAtual + (aceleracao *  vezes) >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += (aceleracao * vezes);
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
}
