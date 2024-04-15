package classe.src.POO.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Jetta jetta = new Jetta(220);
        jetta.ligarTurbo();
        jetta.acelerar();
        System.out.println(jetta.velAtual);

        Carro civic = new Civic(190);
        civic.acelerar();
        System.out.println(civic.velAtual);
    }
}
