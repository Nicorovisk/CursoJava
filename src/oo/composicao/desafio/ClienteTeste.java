package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args){

        Produto produto1 = new Produto("Lápis",1.80);
        Produto produto2 = new Produto("Borracha", 2.50);
        Produto produto3 = new Produto("Caneta", 3.00);
        Produto produto4 = new Produto("Apontador", 4.50);
        Produto produto5 = new Produto("Corretivo", 2.00);
        Produto produto6 = new Produto("Caderno", 12.50);

        Cliente cliente1 = new Cliente("Pedro");

        Compra compra1 = new Compra(cliente1);
        Item item1 = new Item(produto1, 5);
        Item item2 = new Item(produto2, 3);

        Compra compra2 = new Compra(cliente1);
        Item item3 = new Item(produto3, 3);
        Item item4 =  new Item(produto4, 2);

        Cliente cliente2 = new Cliente("Ana");

        Compra compra3 = new Compra(cliente2);
        Item item5 = new Item(produto5, 2);
        Item item6 = new Item(produto3, 5);

        Compra compra4 = new Compra(cliente2);
        Item item7 = new Item(produto6, 5);
        Item item8 = new Item(produto1, 10);

        cliente1.adicionarCompra(compra1);
        compra1.adicionarItem(item1);
        compra1.adicionarItem(item2);

        cliente1.adicionarCompra(compra2);
        compra2.adicionarItem(item3);
        compra2.adicionarItem(item4);

        cliente2.adicionarCompra(compra3);
        compra3.adicionarItem(item5);
        compra3.adicionarItem(item6);

        cliente2.adicionarCompra(compra4);
        compra4.adicionarItem(item7);
        compra4.adicionarItem(item8);

        System.out.println("A compra feita por "+cliente1.nome+" ficou em um total de R$"+cliente1.obterValorTotal());
        System.out.println("A compra feita por "+cliente2.nome+" ficou em um total de R$"+cliente2.obterValorTotal());

    }
}
