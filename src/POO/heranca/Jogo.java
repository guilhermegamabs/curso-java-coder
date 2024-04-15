package classe.src.POO.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Heroi();
        j1.x = 10;
        j1.y = 10;
        Jogador j2 = new Monstro();
        j2.x = 10;
        j2.y = 10;

        j2.andar(Direcao.NORTE);

        j1.atacar(j2);
        j2.atacar(j1);


        System.out.println(j1.toString());
        System.out.println();
        System.out.println(j2.toString());
    }
}
