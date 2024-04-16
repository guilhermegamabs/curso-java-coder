package classe.src.arraysCollections.collections;

public class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Meu nome é " + this.nome;
    }

    @Override
    public boolean equals(Object o) {
        Usuario outro = (Usuario) o;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
