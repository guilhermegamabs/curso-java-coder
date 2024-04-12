package classe.src.ArraysCollections.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Carlos");
        queue.offer("Bia");
        queue.add("Pedro");
        queue.offer("Guilherme");

        for (String s : queue) {
            System.out.println(s);
        }

        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println("\n");

        System.out.println("Removido: " + queue.remove());
        System.out.println("Removido: " + queue.remove());
    }
}
