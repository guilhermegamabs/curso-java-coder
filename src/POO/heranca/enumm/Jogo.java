package classe.src.POO.heranca.enumm;

public class Jogo {
    public static void main(String[] args) {
        Jogador j1 = new Jogador();
        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.SUL);
        j1.andar(Direcao.LESTE);

        System.out.println(j1.y);
        System.out.println(j1.x);
    }
}
