package classe.src.excecao;

public class Aluno {
    public final String nome;
    public final double nota;
    public final boolean bomCoportamento;

    public Aluno(String nome, double nota, boolean bomCoportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomCoportamento = bomCoportamento;
    }

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }


    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }
}
