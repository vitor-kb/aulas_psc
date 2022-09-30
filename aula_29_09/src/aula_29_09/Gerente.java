package aula_29_09;
public class Gerente {
    //ATRIBUTO
    private String nome;
    
    //METODO ACESSOR
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    //COMPORTAMENTO
    
    public void atualizar(Funcionario func, String cargo){
        func.setCargo(cargo);
    }
    
    public void atualizar(Funcionario func, double salario){
        func.setSalario(salario);
    }
}
