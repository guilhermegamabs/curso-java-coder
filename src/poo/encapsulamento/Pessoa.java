package classe.src.poo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;


    Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá eu sou o " + getNome() + ",\nTenho " + getIdade() + " anos!";
    }
}
