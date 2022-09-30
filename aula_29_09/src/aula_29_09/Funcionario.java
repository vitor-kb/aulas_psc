package aula_29_09;
public class Funcionario {
    //ATRIBUTOS
    private String nome;
    private String cargo;
    private double salario;
    
    //METODOS
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    //N PRECISA
    /*public String getNome(){
        return this.nome;
    }*/
    
    //N PRECISA
    /*public String getCargo(){
        return this.cargo;
    }*/
    
    //N PRECISA
    /*public double getSalario(){
        return this.salario;
    }*/
    
    public String toString(){
        return "Nome: " + this.nome + "\nCargo: " + this.cargo + "\nSalario: " + this.salario;
    }
}
