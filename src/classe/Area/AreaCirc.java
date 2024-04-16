package classe.src.classe.Area;

public class AreaCirc {
    double raio;
    final static double PI = 3.14;

    AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return PI * raio * raio;
    }
}
