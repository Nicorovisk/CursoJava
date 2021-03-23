package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 =  new Usuario();
        u1.nome = "João Pedro";
        u1.email = "joaopedro@gmailcom";

        Usuario u2 =  new Usuario();
        u2.nome = "João Pedro";
        u2.email = "joaopedro@gmailcom";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));
    }
}
