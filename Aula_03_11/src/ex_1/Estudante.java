package ex_1;

public class Estudante {

    //atributos
    private double notaN1, notaN2;
    private String nome;

    //metodos acessores
    public void setNotaN1(double notaN1) {
        this.notaN1 = notaN1;
    }

    public void setNotaN2(double notaN2) {
        this.notaN2 = notaN2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //comportamento
    double calcularMediaFinal() {
        return this.notaN1 * 0.4 + this.notaN2 * 0.6;
    }
}
