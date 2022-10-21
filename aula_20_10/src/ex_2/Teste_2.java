package ex_2;

public class Teste_2 {

    public static void main(String[] args) {
        Lutador desafiante = new Lutador("Chico", "Mexicano", 29, 1.45, 69, 1, 3, 1, true);
        Lutador desafiado = new Lutador("Popo", "Brazuca", 31, 1.70, 68, 3, 1, 1, false);
        Luta luta = new Luta();
        
        luta.setDesafiado(desafiado);
        luta.setDesafiante(desafiante);
        luta.marcarLuta();
        desafiante.apresentar();
        desafiado.apresentar();
        luta.lutar(3);

    }
}
