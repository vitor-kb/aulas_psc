package aula_09_09;
import java.util.Scanner;
public class Aula_09_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //FAZER UM PROGRAMA EM QUE O USUÁRIO ENTRA COM DOIS NÚMEROS REAIS E ELE 
        //DEVOLVE AO USUÁRIO O RESTO DA DIVISÃO DESTES DOIS NÚMEROS. 
        //NÃO PODE USAR %.
        double numeros[] = new double[2];
        double quociente;
        double resto;
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "° número: ");
            numeros[i] = entrada.nextDouble();
        }
        quociente = numeros[0] / numeros[1];
        resto = numeros[0] - numeros[1] * (int)quociente;
        
        
        System.out.println("Resultado inteiro: " + (int)quociente);
        System.out.println("Resultado real: " + quociente);
        System.out.println("Resto: " + resto);
        
        entrada.close();
    }
}