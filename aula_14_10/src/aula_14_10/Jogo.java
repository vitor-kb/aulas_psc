package aula_14_10;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Personagem perso = new Personagem("Vitor");

        String nomeChar, classes, opcao;

        System.out.println(perso.nome + ", digite o nome do seu seu personagem: ");
        nomeChar = entrada.next();

        System.out.println("Bem vindo, " + nomeChar + " !");

        System.out.println(nomeChar + ", escolha uma das classes: cacador, comilao, soneca.");
        classes = entrada.next();

        switch (classes) {
            case "cacador":
                System.out.println("Cacador escolhido!");
                perso.setStatus(10, 0, 0);
                perso.getStatus();
                break;
            case "comilao":
                System.out.println("Comilao escolhido!");
                perso.setStatus(6, 5, 2);
                perso.getStatus();
                break;
            case "soneca":
                System.out.println("Soneca escolhido!");
                perso.setStatus(1, 4, 7);
                perso.getStatus();
                break;
            default:
                System.out.println("Opcao invalida!");
        }

        System.out.println(nomeChar + ", digite o que desejar realizar: cacar, comer, dormir.");
        opcao = entrada.next();

        switch (opcao) {
            case "cacar":
                perso.cacar();
                perso.getStatus();
                break;
            case "comer":
                perso.comer();
                perso.getStatus();
                break;
            case "dormir":
                perso.dormir();
                perso.getStatus();
                break;
            default:
                System.out.println("Opcao invalida!");
        }
        entrada.close();
    }

}
