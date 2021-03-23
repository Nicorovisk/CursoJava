package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args){
        //Set<String> listaDeAprovados = new HashSet<String>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Amanda");
        listaAprovados.add("Lucas");
        listaAprovados.add("Nicolas");
        listaAprovados.add("Victor");

        for(String candidato: listaAprovados){
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(5);
        nums.add(9);
        nums.add(7);

        for(int n: nums){
            System.out.println(n);
        }
    }
}
