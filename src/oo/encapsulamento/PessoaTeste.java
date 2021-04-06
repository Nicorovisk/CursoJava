package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa(-90, "Pedro", "Silva");
        p1.setIdade(1030);
        System.out.println(p1.getIdade());
        System.out.println(p1.getNome());
        System.out.println(p1);
    }
}
