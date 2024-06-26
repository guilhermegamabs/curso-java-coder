package classe.src.poo.polimorfismo;

public abstract class Comida {
    private double peso;

    public Comida(double peso) {
        setPeso(peso);
    }

    public void comer()  {
        this.peso += peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
