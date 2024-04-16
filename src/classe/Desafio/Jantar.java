package classe.src.classe.Desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Guilherme", 91.5);
        Comida c1 = new Comida("Macarrão", 0.5);

        p1.comer(c1);
        System.out.println(p1.apresentar());
    }
}
