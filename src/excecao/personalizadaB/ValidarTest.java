package classe.src.excecao.personalizadaB;

import classe.src.excecao.Aluno;

public class ValidarTest {
    public static void main(String[] args) {
        try {
            Aluno a1 = new Aluno("Ana", -7);
            Validar.aluno(a1);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("FIM");
    }
}
