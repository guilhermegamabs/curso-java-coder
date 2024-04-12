package classe.src.ArraysCollections.Array;

public class Exercicio {
    public static void main(String[] args) {
        double[] notas = new double[5];
        notas[0] = 10;
        notas[1] = 20;
        notas[2] = 30;
        notas[3] = 40;
        notas[4] = 50;
        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
