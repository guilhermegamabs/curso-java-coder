package classe.src.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Mouse", 350);
        Produto p2 = new Produto("Camiseta", 200, 0.25);

        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(p2.desconto());
    }
}
