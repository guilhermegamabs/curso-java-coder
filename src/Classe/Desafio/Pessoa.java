package classe.src.Classe.Desafio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
