package aula_22_09;
import java.util.Scanner;
public class Numeros {
    public void contagem(int n){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número a ser contado: ");
        n = entrada.nextInt();

        for(int i = 0; i <= n; i++){
            System.out.println(i);
        }
        entrada.close();
    }
}
