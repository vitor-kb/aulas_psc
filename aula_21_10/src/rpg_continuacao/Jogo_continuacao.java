package rpg_continuacao;

import java.util.Scanner;

public class Jogo_continuacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Personagem perso = new Personagem("Vitor");

        String nomeChar, opcao, classes;
        boolean status = true;

        System.out.println(perso.nome + ", digite o nome do seu seu personagem: ");
        nomeChar = entrada.next();

        System.out.println("Bem vindo, " + nomeChar + " !");

        while (status) {

            System.out.println(nomeChar + ", escolha uma das classes: \n"
                    + "1 - cacador\n"
                    + "2 - comilao\n"
                    + "3 - soneca");
            classes = entrada.next();

            switch (classes) {
                case "1":
                    System.out.println("Cacador escolhido!");
                    perso.setStatus(10, 0, 0);
                    perso.getStatus();
                    status = false;
                    break;
                case "2":
                    System.out.println("Comilao escolhido!");
                    perso.setStatus(6, 5, 2);
                    perso.getStatus();
                    status = false;
                    break;
                case "3":
                    System.out.println("Soneca escolhido!");
                    perso.setStatus(1, 4, 7);
                    perso.getStatus();
                    status = false;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }

        while (!status) {
                
            System.out.println(nomeChar + ", digite o que desejar realizar: 1 - cacar, 2 - comer, 3 - dormir.");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                    perso.cacar();
                    perso.getStatus();
                    status = true;
                    break;
                case "2":
                    perso.comer();
                    perso.getStatus();
                    status = true;
                    break;
                case "3":
                    perso.dormir();
                    perso.getStatus();
                    status = true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
                status = perso.isVivo();
        }
        entrada.close();
    }

}
