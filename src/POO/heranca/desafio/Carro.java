package classe.src.POO.heranca.desafio;

public class Carro {
    int velAtual = 100;

    void acelerar() {
        velAtual = velAtual + 10;
    }

    void frear() {
        if (velAtual > 0) {
            velAtual = velAtual - 10;
        }
    }
}
