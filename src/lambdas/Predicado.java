package classe.src.lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco  * (1 - prod.desconto)) >= 20;

        Produto produto = new Produto("Caneta", 1.99, 0.10);
        System.out.println(isCaro.test(produto));
    }
}
