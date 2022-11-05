package ex_01;

import pessoas.*;

public class Escola {

    public static void main(String[] args) {

        Professor p1 = new Professor("Joao");
        Aluno a1 = new Aluno("Vitor");

        a1.setCursos("Java");
        a1.setCursos("Python");
        a1.setCursos("JS");
        a1.setCursos("HTML");

        System.out.println(a1.getCursos());
        System.out.println("Idade inicial: " + a1.getIdade());
        a1.fazerAniversario();
        System.out.println("Idade Parcial: " + a1.fazerAniversario());
        System.out.println("Idade Final: " + a1.getIdade());
        System.out.println(a1.fazerAniversario());
        a1.setMatricula(124442);
        p1.setMatricula(23123);
    }

}
