package aula_29_09;
public class ContaBancaria {
    private String nome;
    private int numero;
    private double saldo;
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    //Comportamento
    public void deposita(double valor){
        this.saldo += valor*1.1;
    }
    public void sacar (double valor){
        if(this.saldo >= valor){
            System.out.println("Saldo:");
            this.saldo -= valor;
        } else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
