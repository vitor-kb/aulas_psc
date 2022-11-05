package pessoas;

public class Professor extends Pessoa {

    //Construtor
    public Professor(String nome) {
        super(nome);
    }

    private int matricula;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

}
