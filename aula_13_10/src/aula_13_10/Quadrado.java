package aula_13_10;

public class Quadrado extends FiguraGeometrica {

    //atributos
    private double lado;

    //metodos acessores
    public double getLado() {
        return this.lado;
    }

    //contrutor
    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }

    //comporamentos
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
