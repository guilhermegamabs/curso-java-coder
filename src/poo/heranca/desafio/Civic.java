package classe.src.poo.heranca.desafio;

public class Civic extends Carro{
    Civic() {
        this(180);
        delta = 15;
    }

    Civic(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 15;
    }
}
