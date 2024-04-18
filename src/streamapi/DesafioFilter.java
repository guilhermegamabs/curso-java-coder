package classe.src.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneta", 1.99, 20);
        Produto p2 = new Produto("Teclado", 250, 3);
        Produto p3 = new Produto("Monitor", 1200, 20);
        Produto p4 = new Produto("Mouse", 350, 2);
        Produto p5 = new Produto("HeadSet", 500, 20);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> valor = p -> p.preco > 300;
        Predicate<Produto> qtd = p -> p.quantidade > 5;
        Function<Produto, String> premio = p -> "O produto " + p.nome + " recebeu frete grátis!";

        produtos.stream().filter(valor).filter(qtd).map(premio).forEach(System.out::println);
    }
}
