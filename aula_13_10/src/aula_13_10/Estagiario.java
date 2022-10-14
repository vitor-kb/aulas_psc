package aula_13_10;

public class Estagiario extends Estudante {

    //atributo
    private int horasTrabalhoSemana;

    //metodos acessores
    public int getHorasTrabalhoSemana() {
        return horasTrabalhoSemana;
    }

    public void setHorasTrabalhoSemana(int horasTrabalhoSemana) {
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    //construtor
    public Estagiario(String nome, String curso, int horasTrabalhoSemana, int horasEstudoSemana) {
        super(nome, curso, horasEstudoSemana);
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    //comportamento
    @Override
    public int horasDedicacao() {
        return this.horasTrabalhoSemana / super.getHorasEstudoSemana();
    }

    @Override
    public double salarioBase() {
        System.out.print("Nome: " + super.getNome() + ", salario = ");
        return this.horasTrabalhoSemana * 10;
    }

}
