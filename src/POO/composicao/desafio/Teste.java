package classe.src.POO.composicao.desafio;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Guilherme");

        Produto p1 = new Produto("Caneta", 1.99);
        Produto p2 = new Produto("Caderno", 11.99);

        Compra c1 = new Compra();

        c1.addItem(p1, 10);
        c1.addItem(p2, 2);

        cliente.addItem(c1);
        System.out.println(cliente.getValorTotal());
    }
}
