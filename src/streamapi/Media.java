package classe.src.streamapi;

public class Media {
    private double total;
    private int quantidade;

    public Media adicionar(double valor){
        total += valor;
        quantidade++;
        return this;
    }

    public double getMedia(){
        return total / quantidade;
    }

    public static Media combinar(Media m1, Media m2) {
        Media resultado = new Media();
        resultado.quantidade = m1.quantidade + m2.quantidade;
        resultado.total = m1.total + m2.total;
        return  resultado;
    }
}
