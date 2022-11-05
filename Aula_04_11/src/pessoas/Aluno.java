package pessoas;

import java.util.ArrayList;

public class Aluno extends Pessoa {

    //Atributos
    private int matricula;
    ArrayList<String> cursos = new ArrayList<>();
    private int notas;

    //Metodos acessores
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<String> getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos.add(cursos);
    }

    //Construtor
    public Aluno(String nome) {
        super(nome);
    }
}
