package classe;

public class ProdutoTeste {

    public static void main(String[] args){

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 5360.79;
        p1.desconto = 0.3;

        Produto p2 =  new Produto();
        p2.nome = "Celular";
        p2.preco = 1049.99;
        p2.desconto = 0.25;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();

        System.out.println(precoFinal1);
        System.out.println(precoFinal2);
    }
}
