package classe;

public class ProdutoTeste {

    public static void main(String[] args){

        Produto p1 = new Produto("Notebook", 5360.79);

        Produto.desconto = 0.45;

        Produto p2 =  new Produto();
        p2.nome = "Celular";
        p2.preco = 1049.99;

        Produto.desconto = 0.5;

        Produto p3 =  new Produto("Caneta", 1.99);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double precoFinal3 = p3.precoComDesconto();

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
        System.out.println(precoFinal3);

    }
}
