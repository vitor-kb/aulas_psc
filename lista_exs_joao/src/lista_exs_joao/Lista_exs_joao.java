package lista_exs_joao;

import java.util.Scanner;

public class Lista_exs_joao {
        public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

                // RODE UM DE CADA VEZ, COMENTE OS OUTROS ANTES DE USAR POR POSSUIR VARIÁVEIS
                // COM NOMES PARECIDOS.
                // EX 1
                // int numeroero;
                // System.out.println("Digite um número inteiro: ");
                // numeroero = entrada.nextInt();
                // System.out.println("O número digitado é: " + numeroero);

                // EX 2
                // float numeroero_real;
                // System.out.println("Digite um número real: ");
                // numeroero_real = (float) entrada.nextFloat();
                // System.out.println("O número digitado é: " + numeroero_real);

                // EX 3
                // int numeroero1, numeroero2, numeroero3, soma;
                // System.out.println("Digite um número inteiro: ");
                // numeroero1 = entrada.nextInt();
                // System.out.println("Digite outro número inteiro: ");
                // numeroero2 = entrada.nextInt();
                // System.out.println("Digite outro número inteiro: ");
                // numeroero3 = entrada.nextInt();
                // soma = numeroero1 + numeroero2 + numeroero3;
                // System.out.println("A soma dos números é: " + soma);

                // EX 4
                // String caractere;
                // System.out.println("Insira o caracter para conversão: ");
                // caractere = entrada.next();
                // System.out.println("Caractere em UNICODE: " + caractere.codePointAt(0));

                // EX 5
                // int temperatura, convert_f;
                // System.out.println("Digite a temperatura em C°: ");
                // temperatura = entrada.nextint();
                // convert_f = (temperatura * (9.0 / 5.0) + 32);
                // System.out.println("Temperatura em F: " + convert_f);

                // EX 6
                // int velocidade_km, velocidade_ms;
                // System.out.println("Digite a velocidade em km/h: ");
                // velocidade_km = entrada.nextint();
                // velocidade_ms = velocidade_km / 3.6;
                // System.out.println("Velocidade em metros por segundo: " + velocidade_ms +
                // "m/s");

                // EX 7
                // int numeroero, antecessor;
                // System.out.println("Digite um número inteiro: ");
                // numeroero = entrada.nextInt();
                // antecessor = numeroero - 1;
                // System.out.println("O antecessor do número é: " + antecessor);

                // EX 8
                // int ano_nascimento, idade;
                // int ano = 2022;
                // System.out.println("Digite o seu ano de nascimento: ");
                // ano_nascimento = entrada.nextInt();
                // idade = ano - ano_nascimento;
                // System.out.println("A sua idade é: " + idade);

                // EX 9
                // float pi = (float) 3.141415926535;
                // float raio = 2 * 2;
                // float area = pi * raio;
                // System.out.printf("A area da circunferencia e: %.2f \n", area);

                // EXTRA - faça um programa que leia o maior e menor número de uma lista de 5
                /*int valores = 0, maior = 0, menor = 0;

                for (int x_valores = 0; x_valores < 5; x_valores++) {

                        System.out.println("Insira um valor:");
                        valores = entrada.nextInt();

                        if (x_valores == 0) {
                                maior = valores;
                                menor = valores;
                        }

                        if (valores > maior) {
                                maior = valores;
                        }

                        if (valores < menor) {
                                menor = valores;
                        }
                }

                System.out.print("Maior: " + maior + "\nMenor: " + menor);*/
                
                // IF ternário
                // valor = valor1 > valor2 ? valor1 : valor2;
                // https://github.com/jcoghi
                entrada.close();
        }
}
