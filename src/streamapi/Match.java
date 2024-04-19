package classe.src.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gui", 9.9);
        Aluno a2 = new Aluno("Bia", 7.7);
        Aluno a3 = new Aluno("Lua", 4.3);
        Aluno a4 = new Aluno("Ana", 8.5);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
    }
}
