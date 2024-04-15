package classe.src.POO.heranca.desafio;

public class Carro {
    final int VELOCIDADE_MAXIMA;
    int velAtual = 100;
    int delta = 10;

    Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if(velAtual + delta > VELOCIDADE_MAXIMA) {
            velAtual = VELOCIDADE_MAXIMA;
        } else {
            velAtual = velAtual + delta;
        }
    }

    void frear() {
        if (velAtual > 10) {
            velAtual = velAtual - delta;
        } else {
            velAtual = 0;
        }
    }
}
