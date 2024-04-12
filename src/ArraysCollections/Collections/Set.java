package classe.src.ArraysCollections.Collections;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add("Hello");
        conjunto.add("World");
        conjunto.add(1);
        conjunto.add(1.1);

        for (Object o : conjunto) {
            System.out.println(o);
        }

        System.out.println("Tamanho é: " + conjunto.size());
        System.out.println(conjunto.remove(1.1));
    }
}
