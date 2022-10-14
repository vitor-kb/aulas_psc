package aula_13_10;

public class Supervisor implements Funcionario {

    //atributos
    private String nome;
    private int qtdSupervisionados;
    private double salarioBase;

    //metodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdSupervisionados() {
        return qtdSupervisionados;
    }

    public void setQtdSupervisionados(int qtdSupervisionados) {
        this.qtdSupervisionados = qtdSupervisionados;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.salarioBase = SalarioBase;
    }

    //construtor
    public Supervisor(String nome, int qtdSupervisionados, double salarioBase) {
        this.nome = nome;
        this.qtdSupervisionados = qtdSupervisionados;
        this.salarioBase = salarioBase;
    }

    //comportamento
    @Override
    public double salarioBase() {
        System.out.print("Nome: " + this.nome + ", supervisor, salario =");
        return this.salarioBase * this.qtdSupervisionados;
    }

}
