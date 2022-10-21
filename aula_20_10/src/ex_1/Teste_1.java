package ex_1;

public class Teste_1 {

    public static void main(String[] args) {
        //EX 1
        Canhao cn = new Canhao();
        Bala bl = new Bala(10, 0);

        cn.setBala(bl);
        cn.disparar(10, 10);
        cn.getAlacanceMaximo();
        cn.disparar(20, 5);
        cn.getAlacanceMaximo();
        
        
    }

}
