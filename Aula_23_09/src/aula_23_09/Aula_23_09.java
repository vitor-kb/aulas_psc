package aula_23_09;
import java.util.Random;
import java.util.Scanner;
public class Aula_23_09 {
    public static void main(String[] args) {
        Random randao = new Random();
        Scanner entrada = new Scanner(System.in);
        
        //CASSINO
        
        double valorCarteira;
        System.out.println("Digite o valor que quer apostar: ");
        valorCarteira = entrada.nextDouble();
        
        double saldo;
        
        for(int i = 1;; i++){
            
        int dado1 = randao.nextInt(6);
        int dado2 = randao.nextInt(6);
        
        int somaDados = dado1 + dado2;
            
            if (somaDados == 7 || somaDados == 2){
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 1: " + dado2);
                System.out.println("Você ganhou!");
                saldo = valorCarteira * 2;
                System.out.println("Fichas restantes: " + saldo);
                break;
            }
            
            if (somaDados == 10){
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 1: " + dado2);
                System.out.println("Você perdeu!");
                saldo = valorCarteira * 0;
                System.out.println("Fichas restantes: " + saldo);
                System.out.println("Aposte novamente!");
                break;
            }
            
            if (somaDados == 6){
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 1: " + dado2);
                System.out.println("Empate!");
                saldo = valorCarteira;
                System.out.println("Fichas restantes: " + saldo);
                break;
            }
            
            else {
                System.out.println("Dado 1: " + dado1);
                System.out.println("Dado 2: " + dado2);
            }
            
        }
    }
    
}
