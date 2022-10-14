package aula_13_10;

public class ContaCorrente {

    //atributos
    private int numero;
    private double saldo;

    //metodos acessores
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    //comportamentos
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double taxa = valor * 1.005;
        if (taxa <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque efetuado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
