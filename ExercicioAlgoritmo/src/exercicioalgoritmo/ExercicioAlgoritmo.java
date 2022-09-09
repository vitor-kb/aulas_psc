package exercicioalgoritmo;
import java.util.Scanner;
public class ExercicioAlgoritmo {
    public static void main(String[] args) {
        String nome;
        double nota1, nota2, media;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Digite a nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = entrada.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println("A media de " + nome + " e: " + media);
        entrada.close();
    }
}
