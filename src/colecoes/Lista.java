package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista  = new ArrayList<>();

        Usuario u1 = new Usuario("João");
        lista.add(u1);
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Marlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));

        System.out.println(lista.get(3).nome);

        lista.remove(1);
        lista.remove(new Usuario("Bia"));

        for(Usuario user: lista){
            System.out.println(user.nome);
        }

        System.out.println(lista.contains(new Usuario("Lia")));

    }
}
