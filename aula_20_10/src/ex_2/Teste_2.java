package ex_2;

public class Teste_2 {

    public static void main(String[] args) {
        Lutador desafiante = new Lutador(
        "Chico", 
        "Brasileiro", 
        29, 
        0, 
        3, 
        1, 
        1.70, 
        1.35, true);
        Lutador desafiado = new Lutador(
        "Chua", 
        "Americano", 
        29, 
        2, 
        1, 
        1, 
        68, 
        1.70, 
        false);
        Luta lt = new Luta();

        lt.setDesafiado(desafiado);
        lt.setDesafiante(desafiante);
        lt.marcarLuta(3);
        desafiante.apresentar();
        desafiado.apresentar();
        lt.lutar();
        desafiante.status();
        desafiado.status();

    }
}
