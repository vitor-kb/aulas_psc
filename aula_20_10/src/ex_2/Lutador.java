package ex_2;

public class Lutador {

    // atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private double altura, peso;
    private boolean desafiante;

    // construtor
    Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, double peso,
            double altura, boolean desafiante) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        setPeso(peso);
        this.altura = altura;
        this.desafiante = desafiante;
    }

    // metodos acessores
    private void setPeso(double peso) {
        this.peso = peso;
        if (peso < 60) {
            this.categoria = "Leve";
        } else if (peso < 70) {
            this.categoria = "Medio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public String getCategoria() {
        return this.categoria;
    }

    public String getNome() {
        return this.nome;
    }

    // comportamento
    void apresentar() {
        System.out.println("Bem vindos ao combate do seculo!!");
        if (desafiante) {
            System.out.println("Deste lado do ringue temos o desfiante: \n\n");
        } else {
            System.out.println("Do outro lado temos o desafiado: \n\n");
        }
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("Vitorias: " + this.vitorias);
        System.out.println("Derrotas: " + this.derrotas);
        System.out.println("Empates: " + this.empates);
    }

    void status() {
        System.out.println("--- Estatísticas ---");
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
