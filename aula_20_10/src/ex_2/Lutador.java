package ex_2;

public class Lutador {

    //atributos
    private String nome, categoria, nacionalidade;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    private boolean tipo;

    //metodos acessores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria(double peso) {
        if (peso < 60) {
            this.categoria = "Leve";
        } else if (peso < 70) {
            this.categoria = "Medio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //construtor
    Lutador(String nome, String nacionalidade,
            int idade, double altura,
            double peso, int vitorias,
            int derrotas, int empates,
            boolean tipo) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        setCategoria(peso);
        this.tipo = tipo;
    }

    //comportamento
    void apresentar() {
        System.out.println("Bem vindos ao maior torneio de luta!");
        if (tipo) {
            System.out.println("Deste lado do ringue temos o desfiante: ");
        } else {
            System.out.println("Do outro lado temos o desafiado: ");
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    void status() {
        System.out.println("--- card ---");
        System.out.println("Nome: " + this.nome);
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
        System.out.println("-------------");
    }

    void ganharLuta() {
        this.vitorias++;
    }

    void perderLuta() {
        this.derrotas++;
    }

    void empatarLuta() {
        this.empates++;
    }

}
