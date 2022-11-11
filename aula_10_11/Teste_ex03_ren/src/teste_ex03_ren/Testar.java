package teste_ex03_ren;

public class Testar {

    public static void testarVazio(String nome, String senha) throws EmptyFieldException {
        if (nome != "" && senha != "") {

        } else {
            throw new EmptyFieldException();
        }
    }

    public static void testarLoginErrado(String nome, String senha) throws WrongLoginException {
        if (nome.equals("aluno") && senha.equals("1234")) {

        } else {
            throw new WrongLoginException();
        }
    }

}
