package aula_13_10;

public abstract class Estudante implements Funcionario {

    //atributos
    private String curso, nome;
    private int horasEstudoSemana;

    //metodos acessores
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasEstudoSemana() {
        return horasEstudoSemana;
    }

    public void setHorasEstudoSemana(int horasEstudoSemana) {
        this.horasEstudoSemana = horasEstudoSemana;
    }

    //construtor
    public Estudante(String nome, String curso, int horasEstudoSemana) {
        this.curso = curso;
        this.horasEstudoSemana = horasEstudoSemana;
        this.nome = nome;
    }

    //comportamento
    public abstract int horasDedicacao();
}
