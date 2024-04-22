package classe.src.excecao;

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


    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }
}
