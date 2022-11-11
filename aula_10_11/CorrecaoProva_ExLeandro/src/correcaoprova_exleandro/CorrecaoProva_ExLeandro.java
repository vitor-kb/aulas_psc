package correcaoprova_exleandro;

import java.util.Scanner;

public class CorrecaoProva_ExLeandro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite seu CPF: ");
        long CPF = entrada.nextLong();
        long div, mod, soma = 0, dig3 = 0, dig5 = 0, dig7 = 0, digito;

        for (int i = 0; i < 11; i++) {
            div = CPF / 10;
            mod = CPF % 10;
            CPF = div;
            soma += mod;
            if (i == 8) {
                dig3 = mod;
            }
            if (i == 6) {
                dig5 = mod;
            }
            if (i == 4) {
                dig7 = mod;
            }
        }
        if (dig5 == 0) {
            digito = (dig3 % 1) + dig7;
        } else {
            digito = (dig3 % dig5) + dig7;
        }
        System.out.println("---Processando---");
        System.out.println("Bem vindo " + nome + ", seu codigo e: " + nome.charAt(0) + nome.charAt(2) + " - " + digito);

        entrada.close();
    }
}
