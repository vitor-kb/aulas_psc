package exs_16_09;
import java.util.Scanner;
public class Exs_16_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //EX 1 Escrever um programa para exibir os números de 1 até 50 na tela.
        /*for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }*/
        
        //EX 2 Crie um programa que calcula o fatorial de um número.
        // Mas o incrmento do for deve ser ser regressivo.
        /*int acumulador = 1, fatorial;
        
        System.out.println("Ditie o número para o cálculo do fatorial: ");
        fatorial = entrada.nextInt();
        
        for(int i = fatorial; i > 0; i--){
            acumulador *= i;
        }
        System.out.printf("%s! = %s \n", fatorial, acumulador);*/
        
        //EX 3 Fazer um programa para encontrar os números pares entre 1 e 100
        /*for (int i = 1; i <= 50; i++){
            System.out.println((i*2));
        }*/
        
        //EX 4
        /*int valor, resultado;
        
        System.out.println("Digite um número de 1 a 10");
        valor = entrada.nextInt();    
        
        for(int i = 1; i <= 10; i++){
            resultado = valor * i;
            System.out.println(resultado);
        }*/
        
        //EX 5 - errado
        /*int totalDeIdades[];
        int media;
        for(int i = 1; i > 0; i++){
            System.out.println("Digite uma idade: ");
            idades[i] = entrada.nextInt();
            if(i > idades.length){
                System.out.println(idades.length*idades[i]);
                break;
            }
        }*/
        
        //EX 6 - errado
        /*int numeros, pares, impares;
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número: ");
            numeros = entrada.nextInt();
        }
        
        for(int i = 0; i < 10; i++){
            pares = numeros;
            impares = numeros;
        }*/
        entrada.close();
    }
}
