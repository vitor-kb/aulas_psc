package aula_13_10;

public class Circulo extends FiguraGeometrica {

    //atributos
    private double raio;

    //metodos acessores
    public double getRaio() {
        return this.raio;
    }

    //contrutor
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    //comporamentos
    @Override
    public double calcularArea() {
        return (this.raio * this.raio) * Math.PI;
    }

}
