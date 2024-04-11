package classe.src.Produto;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    double desconto() {
        return preco * (1 - desconto);
    }
}
