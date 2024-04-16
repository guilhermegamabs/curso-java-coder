package classe.src.poo.abstrato;

public abstract class Mamifero extends Animal{

    @Override
    public final String mover() {
        return "Saindo do lugar";
    }

    public abstract String mamar();
}
