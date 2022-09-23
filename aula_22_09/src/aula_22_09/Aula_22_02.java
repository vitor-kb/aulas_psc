package aula_22_09;
import java.util.Scanner;
public class Aula_22_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //EXEMPLO
        /*Pessoa objPessoa = new Pessoa();
        
        objPessoa.alunotura =  1.80;
        objPessoa.idade = 22;
        objPessoa.nome = "Vitor";
        
        System.out.println("Nome: " + objPessoa.nome + "\nAltura: " + objPessoa.alunotura + "\nIdade: " + objPessoa.idade);*/
        
        
        //EX 1
        /*Lampada lamp = new Lampada();
        
        lamp.cor = "Branca";
        lamp.marca = "Philips";
        lamp.preco = 10.90;
        lamp.voltagem = 16;
        lamp.acender();
        lamp.apagar();
        
        System.out.println(lamp.toString());*/
        
        //EX 2
        /*Smartphone celular = new Smartphone();
        
        celular.marca = "Xiaomi";
        celular.modelo = "Redmi Note 11 Pro 5G";
        
        celular.botao();
        celular.botao();*/
        
        
        //EX 3
        /*Aluno aluno = new Aluno();
        
        System.out.println("Digite seu nome: ");
        aluno.nome = entrada.next();
        
        System.out.println("Digite RA: ");
        aluno.RA = entrada.next();
        
        System.out.println("Digite a nota 1: ");
        aluno.nota1 = entrada.nextDouble();
        
        System.out.println("Digite a nota 2: ");
        aluno.nota2 = entrada.nextDouble();
        
        aluno.media();
        System.out.println(aluno.toString());*/
        
        entrada.close();
    }
}
