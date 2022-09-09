package exs_leandro;
import java.util.Scanner;

public class Exs_leandro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //PARA APAGAR OS CÓDIGOS COMENTADOS É SÓ REMOVER OS // OU /* */

        //EXEMPLO
        /*Random random = new Random();
        
        int numeros[] = new int[10];
        
        for (int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            numeros[i] = entrada.nextInt();
        }
        
        for (int i = 9; i >=0; i--){
            System.out.println(numeros[i]);
        }*/

        // EX 1
        /*int numeros[] = new int[10];
        int indice = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            numeros[i] = entrada.nextInt();
        }
        int menor = numeros[0];
        for(int i = 0; i < 10; i++ ){
            if(numeros[i] < menor){
                menor = numeros[i];
                indice = i;
            }
        }
        System.out.println("O menor número é: " + menor + " e o indice é: " + indice);
        entrada.close();*/
        
        //EX 2
        /*int vetorA[] = new int[8];
        int vetorB[] = new int [vetorA.length];
        for (int i = 0; i < 8; i++){
            System.out.println("Digite o " + (i+1) + "° valor: ");
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] * 3;
        }
        for(int i = 0; i < 8; i++){
            System.out.println("Vetor " + (i+0) + ":" + vetorB[i]);
        }*/

        //EX 3
        double vetorA[] = new double[4];
        double vetorB[] = new double[7];
        double vetorC[] = new double[11];
        
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor do Vetor A: ");
            vetorA[i] = entrada.nextDouble();
        }
        
        for(int i =0; i < vetorB.length; i++){
            System.out.println("Digite o " + (i+1) + "° valor do Vetor B: ");
            vetorB[i] = entrada.nextDouble();
        }
        for(int i = 0; i < vetorC.length; i++){
            if (i < 4) {
                vetorC[i] = vetorA[i];
            }else {
                vetorC[i] = vetorB[i - 4];
            }
        }
        for(int i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
        entrada.close();
        
    }
}
