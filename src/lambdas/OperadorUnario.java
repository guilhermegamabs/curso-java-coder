package classe.src.lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = x -> x + 2;
        UnaryOperator<Integer> vezesDois = x -> x * 2;
        UnaryOperator<Integer> aoQuadrado = x -> x * x;

        int resul1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resul1);

        int resul2 = maisDois.compose(vezesDois).compose(maisDois).apply(2);
        System.out.println(resul2);

    }
}
