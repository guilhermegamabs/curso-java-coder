package classe.src.Classe.EqualsHashCode;

public class EqualsHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Guilherme";
        u1.email = "guilherme@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Guilherme";
        u2.email = "guilherme@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
