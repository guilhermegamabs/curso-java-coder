package classe.Data;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.dia = 01;
        data1.mes = 10;
        data1.ano = 2004;

        System.out.printf("%d/%d/%d\n", data1.dia, data1.mes, data1.ano);
    }
}
