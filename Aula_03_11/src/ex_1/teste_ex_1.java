package ex_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class teste_ex_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Estudante vetEstudante[] = new Estudante[5];

        boolean estado = true;

        for (int i = 0; i < 5; i++) {
            String nome = null;
            double n1 = 0;
            double n2 = 0;

            try {
                System.out.println("Digite o nome do " + (i + 1) + "o. aluno: ");
                nome = entrada.nextLine();
                System.out.println("Digite a nota N1: ");
                n1 = entrada.nextDouble();
                System.out.println("Digite a nota N2: ");
                n2 = entrada.nextDouble();
                try {
                    TestarNota.testarNota(n1, n2);
                } catch (NotaForaDoIntervaloException erro) {
                    System.out.println(erro.getMessage());
                    estado = false;
                } finally {
                    entrada.nextLine();
                }
            } catch (InputMismatchException erro) {
                System.out.println("Nota invalida: " + erro.getMessage());
                estado = false;
            } finally {
                entrada.nextLine();
            }
            if (estado) {
                vetEstudante[i] = new Estudante();
                vetEstudante[i].setNome(nome);
                vetEstudante[i].setNotaN1(n1);
                vetEstudante[i].setNotaN2(n2);
            }
        }
        for (int i = 0; i < 5; i++) {
            try {
                if(i == 0){
                    System.out.println("---Resultados---");
                }
                System.out.println("Nome: " + vetEstudante[i].getNome());
                System.out.println("Media: " + vetEstudante[i].calcularMediaFinal());
            } catch (NullPointerException erro) {
                System.out.println("Objeto nao gerado!");
            } finally {
                entrada.nextLine();
            }
        }

        entrada.close();
    }
}
