package classe.src.ArraysCollections.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Guilherme");
        mapa.put(4, "Carlos");
        mapa.put(200, "Bia");
        mapa.put(928, "Duda");

        mapa.remove(200);


        System.out.println(mapa.size());

        for (int chave: mapa.keySet()) {
            System.out.println("Nome: " + mapa.get(chave));
        }
    }
}
