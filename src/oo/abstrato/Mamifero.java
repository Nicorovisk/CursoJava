package oo.abstrato;

public abstract class Mamifero extends Animal {

    @Override
    public String mover() {
        return "Com as patas";
    }

    public abstract void mamar();
}
