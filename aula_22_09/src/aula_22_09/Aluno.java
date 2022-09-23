package aula_22_09;
public class Aluno {
    String nome;
    String RA;
    double nota1, nota2, media;
    
    public void media(){
        media = (nota1 + nota2) / 2;
        System.out.println(media);
    }
    
    public String toString(){
        return "Nome: " + nome + "\nRA: " + RA + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMedia: " + media;
    }
}
