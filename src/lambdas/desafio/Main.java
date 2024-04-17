package classe.src.lambdas.desafio;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {


        Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
        UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco;
        UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");

        Produto p = new Produto("iPad", 3235.21, 0.13);
        String preco = precoFinal.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
        System.out.println("O preço final é " + preco);

    }
}
