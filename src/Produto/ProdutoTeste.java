package classe.src.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.preco = 200;
        p1.desconto = 0.25;

        System.out.println(p1.desconto());

        System.out.println(p1.nome);
        System.out.println();
    }
}
