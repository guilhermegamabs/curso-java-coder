package classe.src.classe.ValorxReferencia;

import classe.src.classe.Data.Data;

public class ValorxReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a);
        System.out.println(b);

        Data d1 = new Data(1, 10, 2004);
        Data d2 = d1;

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
