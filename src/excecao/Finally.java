package classe.src.excecao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.println(7 / entrada.nextInt());

            System.out.println("Teste");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally...");
            entrada.close();
        }

        System.out.println("FIM");
    }
}
