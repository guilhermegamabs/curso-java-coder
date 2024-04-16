package classe.src.classe.Data;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data(1, 10, 2004);

        System.out.printf(data1.obterDataFormatada());
        System.out.printf(data2.obterDataFormatada());
    }
}
