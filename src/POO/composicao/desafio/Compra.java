package classe.src.POO.composicao.desafio;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    double getValorTotal() {
        double total = 0;

        for (Item item : itens) {
            total += item.quantidade * item.produto.preco;
        }

        return total;
    }
}
