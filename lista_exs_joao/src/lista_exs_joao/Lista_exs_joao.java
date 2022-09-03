package lista_exs_joao;

import java.util.Scanner;

public class Lista_exs_joao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //RODE UM DE CADA VEZ, COMENTE OS OUTROS ANTES DE USAR POR POSSUIR VARIÁVEIS COM NOMES PARECIDOS.
        //EX 1
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();
        System.out.println("O número digitado é: " + numero);
        entrada.close();
        
        //EX 2
        float numero_real;
        System.out.println("Digite um número real: ");
        numero_real = (float)entrada.nextFloat();
        System.out.println("O número digitado é: " + numero_real);
        entrada.close();
        
        //EX 3
        int numero1, numero2, numero3, soma;
        System.out.println("Digite um número inteiro: ");
        numero1 = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        numero2 = entrada.nextInt();
        System.out.println("Digite outro número inteiro: ");
        numero3 = entrada.nextInt();
        soma = numero1 + numero2 + numero3;
        System.out.println("A soma dos números é: " + soma);
        entrada.close();
        
        //EX 4
        String caractere;
        System.out.println("Insira o caracter para conversão: ");
        caractere = entrada.next();
        System.out.println("Caractere em UNICODE: " + caractere.codePointAt(0));
        
        
        //EX 5
        double temperatura, convert_f;
        System.out.println("Digite a temperatura em C°: ");
        temperatura = entrada.nextDouble();
        convert_f = (temperatura * (9.0 / 5.0) + 32);
        System.out.println("Temperatura em F: " + convert_f);
        entrada.close();
        
        //EX 6
        double velocidade_km, velocidade_ms;
        System.out.println("Digite a velocidade em km/h: ");
        velocidade_km = entrada.nextDouble();
        velocidade_ms = velocidade_km / 3.6;
        System.out.println("Velocidade em metros por segundo: " + velocidade_ms + " m/s");
        entrada.close();
        
        //EX 7
        int numero, antecessor;
        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();
        antecessor = numero - 1;
        System.out.println("O antecessor do número é: " + antecessor);
        entrada.close();
        
        //EX 8
        int ano_nascimento, idade;
        int ano = 2022;
        System.out.println("Digite o seu ano de nascimento: ");
        ano_nascimento = entrada.nextInt();
        idade = ano - ano_nascimento;
        System.out.println("A sua idade é: " + idade);
        entrada.close();
        
        //EX 9
        float pi = (float) 3.141415926535;
        float raio = 2*2;
        float area = pi * raio;
        System.out.printf("A área da circunferência é: %.2f \n", area);*/
        
        //EXTRA
        //for(int)
            
        // IF ternário
            //valor = valor1 > valor2 ? valor1 : valor2;
            //https://github.com/jcoghi
        
    }
    
}
