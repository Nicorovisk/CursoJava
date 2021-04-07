package oo.heranca.desafio;

public class Civic extends Carro {
    public Civic(int velocidadeMaxima, int delta){
        super(velocidadeMaxima, delta);
    }
    public Civic(){
        this(150, 15);
    }
}
