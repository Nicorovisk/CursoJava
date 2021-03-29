package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João Victor";
        compra1.adicionarItem("Lápis", 10, 1.20);
        compra1.adicionarItem(new Item("Borracha", 5, 1.50));
        compra1.adicionarItem(new Item("Apontador",2,3.0));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
