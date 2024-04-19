package classe.src.streamapi;

public class Aluno {
    final String nome;
    final double nota;
    final boolean bomCoportamento;

    Aluno(String nome, double nota, boolean bomCoportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomCoportamento = bomCoportamento;
    }

    Aluno(String nome, double nota) {
        this(nome, nota, true);
    }
}
