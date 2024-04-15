package classe.src.POO.heranca;

public class Monstro extends Jogador{
    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 5;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            oponente.vida -= 5;
            return true;
        }

        return false;
    }

    public String toString() {
        return "Monstro: \n" + vida + " de vida\nX: " + x + " \nY: " + y;
    }
}
