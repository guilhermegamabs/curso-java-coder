package classe.src.streamapi;

public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media().adicionar(8.4).adicionar(9.6);
        Media m2 = new Media().adicionar(5.7).adicionar(6.6);


        /*
        m1.adicionar(8.3);
        m1.adicionar(2.6);
        */

        System.out.println(m1.getMedia());
        System.out.println(m2.getMedia());


        System.out.println(Media.combinar(m1, m2).getMedia());
    }
}
