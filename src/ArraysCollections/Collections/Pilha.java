package classe.src.ArraysCollections.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.push("Guilherme");
        deque.push("Carlos");
        deque.push("Pedro");
        deque.push("Ana");
        deque.push("Luana");


        System.out.println("Pool: " + deque.poll());
        System.out.println("Pop: " + deque.pop());
        System.out.println("\n");

        for (String data : deque) {
            System.out.println("Nome: " + data);
        }
    }
}
