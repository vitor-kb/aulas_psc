package aula_13_10;

import java.util.Scanner;

public class Aula_13_10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //EX 01 - PRÁTICO
        /*ContaCorrente cc = new ContaCorrente();
        ContaEspecial ce = new ContaEspecial();
        
        cc.depositar(100);
        System.out.println(cc.getSaldo());
        cc.sacar(90);
        System.out.println("Saldo conta corrente: " + cc.getSaldo());
        
        ce.depositar(100);
        System.out.println(ce.getSaldo());
        ce.sacar(90);
        System.out.println("Saldo conta especial: " + ce.getSaldo());*/
        //EX 2
        /*Circulo c = new Circulo("Circulo", 2);
        Quadrado q = new Quadrado("Quadrado", 3);
        Triangulo t = new Triangulo("Triangulo", 2, 3);
        
        System.out.println(c.getNome() + ": " + c.calcularArea());
        System.out.println(q.getNome() + ": " + q.calcularArea());
        System.out.println(t.getNome() + ": " + t.calcularArea());*/
        //EX 3
        Funcionario f[] = new Funcionario[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Deseja inserir um estagiário (e) ou supervisor(s)?");
            char opcao = entrada.next().charAt(0);
            switch (opcao) {
                case 'e':
                    System.out.print("Digite o nome: ");
                    String nome = entrada.next();
                    System.out.print("Digite o curso: ");
                    String curso = entrada.next();
                    System.out.println("Digite horas de estudo: ");
                    int horasEstudo = entrada.nextInt();
                    System.out.println("Digite as horas de trabalho: ");
                    int horasTrabalho = entrada.nextInt();
                    Estagiario e = new Estagiario(nome, curso, horasEstudo, horasTrabalho);
                    f[i] = e;
                    break;
                case 's':
                    System.out.print("Digite o nome: ");
                    String nomeS = entrada.next();
                    System.out.println("Ditei a qtd de superv: ");
                    int qtdSup = entrada.nextInt();
                    System.out.println("Digite o salario base: ");
                    double salario = entrada.nextDouble();
                    Supervisor s = new Supervisor(nomeS, qtdSup, salario);
                    f[i] = s;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

        }

        for (int i = 0; i < 3; i++) {
            System.out.println(f[i].salarioBase());
        }

        entrada.close();
    }
}
