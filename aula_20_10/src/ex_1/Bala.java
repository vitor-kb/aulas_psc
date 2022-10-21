package ex_1;

public class Bala {

    //atributos
    private double posicaoX, posicaoY;

    //comportamentos
    double getPosicaoX() {
        return posicaoX;
    }

    void setPosicaoX(double X) {
        this.posicaoX = X;
    }

    double getPosicaoY() {
        return posicaoY;
    }

    void setPosicaoY(double Y) {
        this.posicaoY = Y;
    }

    //construtor
    Bala(double X, double Y) {
        this.posicaoX = X;
        this.posicaoY = Y;
    }

}
