package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

    public Ferrari(int velocidadeMaxima, int delta){
        super(velocidadeMaxima, delta);
    }

    public Ferrari(){
        this(300, 20);
    }

    @Override
    public void ligarTurbo() {
        setDelta(35);
    }

    @Override
    public void desligarTurbo() {
        setDelta(15);

    }

    @Override
    public void ligarAr() {

    }

    @Override
    public void desligarAr() {

    }
}
