package aula_14_10;

public class Personagem {

    //atributos
    String nome;

    int energia, fome, sono;

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
        } else {
            System.out.println("Não pode cacar!");
        }

    }

    void comer() {
        if (this.fome > 1) {
            this.fome = 0;
            this.energia -= 1;
            this.sono += 2;
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

    //construtor - publico e void por padrao
    Personagem(String nome) {
        this.nome = nome;
    }
}
