package classe.src.POO.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Guilherme");
        Aluno a2 = new Aluno("Pedro");
        Aluno a3 = new Aluno("Ana");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("PHP");
        Curso curso3 = new Curso("JavaScript");

        curso1.addAluno(a1);
        curso1.addAluno(a2);

        curso2.addAluno(a1);
        curso2.addAluno(a3);

        curso3.addAluno(a2);
        curso3.addAluno(a3);

        for(Aluno aluno: curso1.alunos) {
            System.out.println("Curso " + curso1.nome);
            System.out.println("Nome: " + aluno.nome);
            System.out.println();
        }

        for(Aluno aluno: curso2.alunos) {
            System.out.println("Curso " + curso2.nome);
            System.out.println("Nome: " + aluno.nome);
            System.out.println();
        }

        for(Aluno aluno: curso3.alunos) {
            System.out.println("Curso " + curso3.nome);
            System.out.println("Nome: " + aluno.nome);
            System.out.println();
        }

        System.out.println(a1.cursos.get(0).alunos);
        Curso cursoEncontrado = a1.obterCursoPorNome("Java");

        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
