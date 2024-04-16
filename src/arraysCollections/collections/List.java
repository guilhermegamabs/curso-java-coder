package classe.src.arraysCollections.collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Guilherme"));
        usuarios.add(new Usuario("Carlos"));
        usuarios.add(new Usuario("Julia"));
        usuarios.add(new Usuario("Carla"));

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.nome);
        }

        System.out.println("\n");

        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
    }
}
