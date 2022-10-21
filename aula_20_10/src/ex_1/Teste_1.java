package ex_1;

public class Teste_1 {

    public static void main(String[] args) {
        //EX 1
        Canhao cn = new Canhao();
        Bala bala = new Bala();

        cn.setBala(bala);
        cn.setBala(0, 0);
        cn.disparar(5, 45);
        System.out.println("A posicao final da bala e: " + cn.getAlacanceMaximo());
        cn.setBala(1, 1);
        cn.disparar(5, 45);
        System.out.println("A posicao final da bala e: " + cn.getAlacanceMaximo());
        cn.setBala(5, 3);
        cn.disparar(9, 27);
        System.out.println("A posicao final da bala e: " + cn.getAlacanceMaximo());
        
        
    }

}
