package classe.src.POO.abstrato;

public class Teste {
    public static void main(String[] args) {
        // Erro (é abstrato): Animal a = new Mamifero();
        // Erro (é abstrato): Animal a = new Animal();

        Animal a = new Cachorro();
        System.out.println(a.mover());
    }
}
