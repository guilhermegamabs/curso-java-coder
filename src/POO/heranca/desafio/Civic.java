package classe.src.POO.heranca.desafio;

public class Civic extends Carro{
    @Override
    void acelerar() {
        velAtual = velAtual + 15;
    }

    @Override
    void frear() {
        if (velAtual > 0) {
            velAtual = velAtual - 15;
        }
    }
}
