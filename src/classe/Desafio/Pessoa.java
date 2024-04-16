package classe.src.classe.Desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer(Comida comida) {
        this.peso += comida.peso;
    }

    String apresentar() {
        return "Nome: " + nome + " Peso: " + peso;
    }
}
