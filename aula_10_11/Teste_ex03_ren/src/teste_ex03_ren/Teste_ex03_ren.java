package teste_ex03_ren;

import java.util.Scanner;

public class Teste_ex03_ren {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Login lg = new Login();
        boolean status = true;

        do {
            System.out.println("Digite o nome: ");
            String nome = entrada.nextLine();
            System.out.println("Digite a senha: ");
            String senha = entrada.nextLine();

            try {
                Testar.testarVazio(nome, senha);
                Testar.testarLoginErrado(nome, senha);
                lg.logar(nome, senha);
                status = false;
            } catch (EmptyFieldException e) {
                System.out.println(e.getMessage());
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
            }
        } while (status);

    }

}
