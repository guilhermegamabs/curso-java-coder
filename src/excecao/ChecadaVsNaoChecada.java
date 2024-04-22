package classe.src.excecao;

import com.sun.source.tree.TryTree;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        System.out.println("FIM");
    }

    // Não checada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um ERRO 01!");
    }

    // Checada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um ERRO 02");
    }

}
