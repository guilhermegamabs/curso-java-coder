package classe.src.POO.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.isOn());
        c.ligar();
        c.acelerar();
        System.out.println(c.motor.giros());
    }
}
