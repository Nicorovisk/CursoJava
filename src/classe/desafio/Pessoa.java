package classe.desafio;

public class Pessoa {

    String nome;
    double peso;

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comerComida(Comida comida){
        System.out.println(nome + " comeu "+ comida.nome + ".");
        peso += comida.peso;
    }

    public void imprimirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Peso: "+peso+" kgs.");
    }
}
