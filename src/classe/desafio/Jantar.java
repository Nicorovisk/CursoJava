package classe.desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("João", 75);
        Pessoa p2 = new Pessoa("Pedro", 90);

        Comida c1 = new Comida("Arroz", 0.3);
        Comida c2 = new Comida("Feijão", 0.3);
        Comida c3 = new Comida("Bife", 0.3);
        Comida c4 = new Comida("Sorvete", 0.2);
        Comida c5 = new Comida("Hamburger", 0.6);

        p1.imprimirDados();
        p1.comerComida(c1);
        p1.comerComida(c2);
        p1.comerComida(c3);
        p1.imprimirDados();

        p2.imprimirDados();
        p2.comerComida(c4);
        p2.comerComida(c5);
        p2.imprimirDados();


    }
}
