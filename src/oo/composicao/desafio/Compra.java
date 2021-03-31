package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Compra {

    Cliente cliente;

    Compra(Cliente cliente){
        this.cliente = cliente;
    }

    ArrayList<Item> itens = new ArrayList<>();

    double obterValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.produto.preco * item.quantidade;
        }
        return total;
    }

    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }
}
