package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual = 0;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(int vezes, int aceleracao){
        if(velocidadeAtual + (aceleracao *  vezes) >= VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else{
            velocidadeAtual += (aceleracao * vezes);
        }

    }

    void frear(){
        if(velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        }
        else{
            velocidadeAtual = 0;
        }
    }
}
