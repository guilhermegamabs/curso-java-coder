package classe.src.Classe.EqualsHashCode;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        Usuario usuario = (Usuario) obj;

        boolean nomeIguais = usuario.nome.equals(this.nome);
        boolean emailIguais = usuario.email.equals(this.email);

        return nomeIguais && emailIguais;
    }
}
