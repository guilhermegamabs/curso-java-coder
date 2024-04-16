package classe.src.arraysCollections.array;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas deseja informar? ");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < qtdNotas; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("Média das notas: ");

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }

        total = total / qtdNotas;

        System.out.println("A média é: " + total);

        scanner.close();

    }
}
