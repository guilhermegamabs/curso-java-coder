package classe.src.poo.heranca.desafio;

public class Jetta extends Carro implements Esportivo{
    Jetta() {
        super(220);
        delta = 20;
    }

    Jetta(int velMaxima) {
        super(velMaxima);
        delta = 20;
    }

    @Override
    public void ligarTurbo() {
        delta = 25;
    }

    @Override
    public void desligarTurbo() {
        delta = 20;
    }
}
