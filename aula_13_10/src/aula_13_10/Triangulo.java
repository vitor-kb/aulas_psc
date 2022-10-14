package aula_13_10;

public class Triangulo extends FiguraGeometrica {

    //atributos
    private double base, altura;

    //metodos acessores
    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    //contrutor
    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    //comporamentos
    @Override
    public double calcularArea() {
        return this.base * this.altura / 2;
    }
}
