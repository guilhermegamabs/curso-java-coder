package classe.src.excecao;


public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Não pode dividir por 0!");
        }

        try {
            imprimirAluno(a1);

        } catch (NullPointerException e) {
            System.out.println("Não pode ler Null!");
        }


        System.out.println("Fim!");
    }

    public static void imprimirAluno(Aluno aluno) {
        System.out.println(aluno. nome);
    }
}
