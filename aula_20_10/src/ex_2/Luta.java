package ex_2;

import java.util.Random;

public class Luta {

    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds, ado = 0, ante = 0;
    private boolean aprovada;
    //metodos acessores

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    //comportamento
    void marcarLuta() {
        if (desafiante.equals(desafiado)
                || desafiante.getCategoria() != desafiado.getCategoria()) {
            System.out.println("Luta cancelada!");
            this.aprovada = false;
        } else {
            System.out.println("Luta aprovada!");
            this.aprovada = true;
        }
    }

    void lutar(int rounds) {
        Random aleatorio = new Random();
        
        if(aprovada){
            desafiante.apresentar();
            desafiado.apresentar();
            System.out.println("Inicio da luta");
            for (int i = 0; i < rounds; i++) {
                System.out.println("Round: " + (i+1));
                int luta = aleatorio.nextInt(2);
                if(luta == 0){
                    ante++;
                    System.out.println("Vitoria do desafiante!");
                }
                if(luta == 1){
                    ado++;
                    System.out.println("Vitoria do desafiado!");
                }
                if(luta == 2){
                    System.out.println("Empate!");
                }
            }
            if(ado > ante){
                desafiado.ganharLuta();
                desafiante.perderLuta();
            }
            if(ante > ado){
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }
            if(ante == ado){
                desafiante.empatarLuta();
                desafiado.empatarLuta();
            }
        }
    }

}
