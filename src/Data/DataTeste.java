package classe.src.Data;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 01;
        data1.mes = 10;
        data1.ano = 2004;

        System.out.printf(data1.obterDataFormatada());
    }
}
