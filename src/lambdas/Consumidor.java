package classe.src.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Caneta", 1.99, 0.15);
        Produto p2 = new Produto("Mouse", 350, 0.25);
        Produto p3 = new Produto("Teclado", 250, 0.25);
        Produto p4 = new Produto("Celular", 3500, 0.35);

        //imprimir.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);

        produtos.forEach(imprimir);
        System.out.println();
        // ForEach espera receber um Consumer
        produtos.forEach(p -> System.out.println(p.preco));
        System.out.println();
        produtos.forEach(System.out::println);
    }
}
