package classe.src.POO.heranca.desafio;

public class Jetta extends Carro{
    @Override
    void acelerar() {
        velAtual = velAtual + 20;
    }

    @Override
    void frear() {
        if (velAtual > 0) {
            velAtual = velAtual - 20;
        }
    }
}
