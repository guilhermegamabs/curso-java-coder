package classe.src.POO.heranca;

public class Heroi extends Jogador{

    Heroi() {
        super(0, 0);
    }

    Heroi(int x, int y) {
        super(x, y);
    }

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);

        if(deltaX == 0 && deltaY == 1) {
            oponente.vida -= 20;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            oponente.vida -= 20;
            return true;
        }

        return false;
    }

    public String toString() {
        return "Herói: \n" + vida + " de vida\nX: " + x + " \nY: " + y;
    }
}
