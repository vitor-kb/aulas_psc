package aula_06_10;

import java.util.Scanner;

public class Aula_06_10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //EX 1
        /*double medias[] = new double[5];
        double media, soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a nota do " + (i+1) + "o. aluno: ");
            medias[i] = entrada.nextDouble();
            soma += medias[i];
        }
        media = soma/5;
        
        for (int i = 0; i < 5; i++) {
            if(medias[i] >= media){
                System.out.println("Aluno " + (i+1) + "parabéns!");
            }else System.out.println("Aluno " + (i+1) + "estude mais...");
        }*/
        //EX 2
        /*int valores[] = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + "o. valor");
            valores[i] = entrada.nextInt();
        }

        int maior = valores[0];
        int menor = valores[0];

        for (int i = 0; i < 10; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        System.out.println("Maior: " + maior + "\nMenor: " + menor);*/
        //EX 3
        /*String nomes[] = new String [3];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o " + (i+1) + "o. nome: ");
            nomes[i] = entrada.nextLine();
        }
        
        System.out.println("Nome: " + nomes[0] + "\nNome: " + nomes[1] + "\nNome: " + nomes[2]);
        
        System.out.println("Ordem inversa.");
        
        for (int i = 2; i>= 0; i--) {
            System.out.println(nomes[i]);
        }*/
        //EX 4
        /*String nomes[][] = new String[3][1];
        double notas[][] = new double[3][2];
        double media[] = new double[3];

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                if (coluna == 0) {
                    System.out.println("Digite um nome: ");
                    nomes[linha][coluna] = entrada.next();
                    System.out.println("Digite a nota 1: ");
                    notas[linha][coluna] = entrada.nextDouble();
                } else {
                    System.out.println("Digite a nota 2: ");
                    notas[linha][coluna] = entrada.nextDouble();
                }
            }
            media[linha] = notas[linha][0] * 0.4 + notas[linha][1] * 0.6;
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("A media do(a) aluno(a): " + nomes[i][0] + " e: " + media[i]);
        }*/
        //EX 5
        System.out.println("Inicializando...");
        String horaU = entrada.nextLine();
        if (horaU == "") {
            Relogio rel = new Relogio();
            chamar();
        } else {
            String minutoU = entrada.nextLine();
            if (minutoU == "") {
                Relogio rel = new Relogio(Integer.parseInt(horaU));
                chamar();
            } else {
                String segundoU = entrada.nextLine();
                if (segundoU == "") {
                    Relogio rel = new Relogio(Integer.parseInt(horaU), Integer.parseInt(minutoU));
                    chamar();
                } else {
                    Relogio rel = new Relogio(Integer.parseInt(horaU), Integer.parseInt(minutoU), Integer.parseInt(segundoU));
                    chamar();
                }
            }
        }
        entrada.close();
    }

    public static void chamar() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Deseja ajustar a hora? (S ou N)");
        char opcao = entrada.next().charAt(0);
        if (opcao == 'S' || opcao == 's') {
            Relogio rel = new Relogio(opcao);
            rel.acertaHora();
        }
        entrada.close();
    }

}
