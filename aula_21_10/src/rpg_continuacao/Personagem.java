package rpg_continuacao;

import java.util.Random;

public class Personagem {

    //atributos
    String nome;

    int energia, fome, sono;

    int comida = 0;

    //metodos - estao publicos por padrao
    void getStatus() {
        System.out.println("Energia: " + this.energia + "\nFome: " + this.fome + "\nSono: " + this.sono);
    }

    void setStatus(int energia, int fome, int sono) {
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }

    //comportamentos
    void cacar() {
        if (this.energia > 2) {
            this.energia -= 2;
            this.fome += 1;
            this.fome += 1;

            if (randomico() == true) {
                comida++;
                System.out.println("---------------------");
                System.out.println("Achou " + comida + " comida!");
                System.out.println("---------------------");
                comer();
            } else {
                System.out.println("---------------------");
                System.out.println("Não achou nada!");
                System.out.println("---------------------");
                this.fome++;
            }

        } else {
            System.out.println("Não pode cacar!");
        }

    }

    void comer() {
        if (this.fome > 1) {
            if (comida >= 1) {
                System.out.println("Comeu!");
                this.energia -= 1;
                this.sono += 2;
                this.comida = 0;
                this.fome = 0;
            } else {
                System.out.println("Sem comida!");
            }
        } else {
            System.out.println("Não precisa comer!");
        }

    }

    void dormir() {
        if (this.sono > 3) {
            this.sono = 0;
            this.energia += 10;
            this.fome += 2;
        } else {
            System.out.println("Não precisa dormir!");
        }

    }

    boolean isVivo() {
        if (this.fome == 10 && this.sono < 7) {
            return true;
        } else {
            return false;
        }
    }

    void sono() {
        if (this.sono == 7) {
            dormir();
        }
    }

    private boolean randomico() {
        Random random = new Random();
        return random.nextBoolean();
    }

    //construtor - publico e void por padrao
    Personagem(String nome) {
        this.nome = nome;
    }
}
