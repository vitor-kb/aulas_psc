package ex_2;

import java.util.Random;

public class Luta {

    // atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int ado = 0, ante = 0;

    // metodos acessores

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    // comportamento
    void marcarLuta(int rounds) {
        this.rounds = rounds;
        if (desafiado.getCategoria().equals(desafiante.getCategoria())
                && desafiado.getNome() != desafiante.getNome()) {
            aprovada = true;
            System.out.println("Luta valida entre " + desafiado.getNome() + " e " + desafiante.getNome());
        }
    }

    void lutar() {
        if (aprovada) {
            for (int round = 0; round < this.rounds; round++) {
                System.out.println("Round: " + (round + 1));
                System.out.println("----LUTEM----");
                Random aleatorio = new Random();
                int teste = aleatorio.nextInt(2);
                switch (teste) {
                    case 0:
                        System.out.println("Vitoria do " + desafiado.getNome());
                        ado++;
                        break;
                    case 1:
                        System.out.println("Vitoria do " + desafiante.getNome());
                        ante++;
                        break;
                    case 2:
                        System.out.println("Empate!");
                        break;
                }
            }
            if (ado > ante) {
                System.out.println("\nVencedor: " + desafiado.getNome());
                desafiado.ganharLuta();
                desafiante.perderLuta();
            }
            if (ante > ado) {
                System.out.println("\nVencedor: " + desafiante.getNome());
                desafiado.perderLuta();
                desafiante.ganharLuta();
            }
            if (ante == ado) {
                System.out.println("\nEmpate!");
                desafiante.empatarLuta();
                desafiado.empatarLuta();
            }
        }
    }

}
