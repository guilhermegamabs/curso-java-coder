package classe.src.POO.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.nomeCliente = "Guilherme";
        c1.itens.add(new Item("Caneta", 20, 3.49));
        c1.itens.add(new Item("Caderno", 31, 17.49));
        c1.addItem(new Item("Lápis", 15, 1.99));
        
        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());

    }
}
