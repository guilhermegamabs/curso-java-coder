package classe.src.poo.composicao;

import java.util.ArrayList;

public class Compra {
    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(Item item) {
        itens.add(item);
        item.compra = this;
    }

    double getValorTotal() {
        double total = 0;

        for (Item item: itens) {
            total += item.quantidade * item.preco;
        }

        return total;
    }
}
