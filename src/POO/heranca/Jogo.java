package classe.src.POO.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Heroi(10, 10);
        Jogador j2 = new Monstro(10, 10);


        j2.andar(Direcao.NORTE);

        j1.atacar(j2);
        j2.atacar(j1);


        System.out.println(j1.toString());
        System.out.println();
        System.out.println(j2.toString());
    }
}
