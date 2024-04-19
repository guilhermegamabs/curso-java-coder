package classe.src.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gui", 9.9);
        Aluno a2 = new Aluno("Bia", 7.7);
        Aluno a3 = new Aluno("Lua", 4.3);
        Aluno a4 = new Aluno("Ana", 8.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, Double> getNota = n -> n.nota;
        BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        Media media = alunos.stream().filter(aprovado).map(getNota).reduce(new Media(), calcularMedia, combinarMedia);
        System.out.println("A média da turma aprovados é: " + media.getMedia());
    }
}
