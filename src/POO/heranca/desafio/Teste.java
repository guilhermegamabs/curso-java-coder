package classe.src.POO.heranca.desafio;

public class Teste {
    public static void main(String[] args) {
        Carro civic = new Civic();
        civic.acelerar();
        System.out.println(civic.velAtual);

        Carro jetta = new Jetta();
        jetta.acelerar();
        System.out.println(jetta.velAtual);
    }
}
