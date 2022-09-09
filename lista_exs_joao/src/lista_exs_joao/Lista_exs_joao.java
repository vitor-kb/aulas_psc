package lista_exs_joao;

import java.util.Scanner;

public class Lista_exs_joao {
        public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

                // RODE UM DE CADA VEZ, COMENTE OS OUTROS ANTES DE USAR POR POSSUIR VARIÁVEIS
                // COM NOMES PARECIDOS.
                // EX 1
                // int numero;
                // System.out.println("Digite um número inteiro: ");
                // numero = entrada.nextInt();
                // System.out.println("O número digitado é: " + numero);

                // EX 2
                // float numero_real;
                // System.out.println("Digite um número real: ");
                // numero_real = (float) entrada.nextFloat();
                // System.out.println("O número digitado é: " + numero_real);

                // EX 3
                // int numero1, numero2, numeroe3, soma;
                // System.out.println("Digite um número inteiro: ");
                // numero1 = entrada.nextInt();
                // System.out.println("Digite outro número inteiro: ");
                // numero2 = entrada.nextInt();
                // System.out.println("Digite outro número inteiro: ");
                // numero3 = entrada.nextInt();
                // soma = numero1 + numeroe2 + numero3;
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
                // int numero, antecessor;
                // System.out.println("Digite um número inteiro: ");
                // numero = entrada.nextInt();
                // antecessor = numero - 1;
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
                /*int valores, maior, menor;
                
                System.out.println("Insira um valor:");
                
                valores = entrada.nextInt();
                maior = valores;
                menor = valores;
                
                for (int x_valores = 1; x_valores < 5; x_valores++) {

                        System.out.println("Insira um valor:");
                        valores = entrada.nextInt();

                        if (valores > maior) {
                                maior = valores;
                        }

                        if (valores < menor) {
                                menor = valores;
                        }
                }

                System.out.println("Maior: " + maior + "\nMenor: " + menor);*/
                
                // IF ternário
                // valor = valor1 > valor2 ? valor1 : valor2;
                // https://github.com/jcoghi
                entrada.close();
        }
}
