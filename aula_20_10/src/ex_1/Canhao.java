package ex_1;

public class Canhao {

    //atributos
    private Bala bala;
    double posicaoXfinal;

    //comportamentos - estao sem public pois os metodos ja sao public por padrao
    void disparar(double velocidade, double angulo) {
        posicaoXfinal = velocidade * velocidade
                * (Math.sin(2 * (Math.toRadians(angulo)) / 9.81));
        System.out.println("Projetil lancado!");
    }

    void getAlacanceMaximo() {
        double local = posicaoXfinal + bala.getPosicaoX();
        System.out.println("O alcance maximo foi de: " + local);
    }

    void setBala(Bala bala) {
        this.bala = bala;
    }

    Bala getBala() {
        return this.bala;
    }
}
