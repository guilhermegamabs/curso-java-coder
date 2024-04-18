package classe.src.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Guilherme", 9.9);
        Aluno a2 = new Aluno("Pedro", 5.6);
        Aluno a3 = new Aluno("Bia", 7.5);
        Aluno a4 = new Aluno("Daniel", 2.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Function<Aluno, String> mensagem = a -> "\nParabéns " + a.nome + "! Você foi aprovado(a)!";

        alunos.stream().filter(aprovado).map(mensagem).forEach(System.out::println);

    }
}
