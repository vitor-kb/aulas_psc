package aula_22_09;
import java.util.Scanner;
public class Modularize {
    public void resultados(){
        Scanner entrada = new Scanner(System.in);
        double resultado = 0;
        int n1, n2, n3, n4;

        System.out.println("Digite tres numeros: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();

        resultado = (n1 + n2) / n3;
        
        System.out.println("--------------");
        System.out.println("Resultado: ");
        System.out.println(resultado);
        System.out.println("--------------");

        System.out.println("Digite outro numero: ");
        n4 = entrada.nextInt();

        resultado = resultado + n4;

        System.out.println("--------------");
        System.out.println("Resultado: ");
        System.out.println(resultado);
        System.out.println("--------------");
        
        entrada.close();
    }
}
