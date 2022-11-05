package pessoas;

public abstract class Pessoa {

    //Atributos
    private String nome;
    private String naturalidade;
    private String sexoBiologico;
    private int idade;

    //Metodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int fazerAniversario() {
        return this.idade++;
    }

    //Construtores
    public Pessoa(String nome) {
        this.nome = nome;
    }

}
