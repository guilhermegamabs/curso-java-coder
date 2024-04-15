package classe.src.POO.heranca.desafio;

public class Jetta extends Carro{
    Jetta() {
        super(220);
        delta = 20;
    }

    Jetta(int velMaxima) {
        super(velMaxima);
        delta = 20;
    }
}
