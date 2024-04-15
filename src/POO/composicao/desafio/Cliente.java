package classe.src.POO.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;
    final ArrayList<Compra> compras = new ArrayList<Compra>();

    Cliente(String nome){
        this.nome = nome;
    }

    void addItem(Compra compra1){
        compras.add(compra1);
    }

    double getValorTotal(){
        double total = 0;

        for(Compra compra : compras){
            total += compra.getValorTotal();
        }

        return total;
    }
}
