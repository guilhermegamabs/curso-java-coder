package classe.src.POO.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(81.95);

        Arroz ingrediente1 = new Arroz(0.30);
        Feijao ingrediente2 = new Feijao(0.25);
        Sorvete sobremesa = new Sorvete(0.50);

        p1.comer(ingrediente2);

        System.out.println(p1.getPeso());

    }
}
