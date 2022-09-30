package aula_30_09;

public class Livros {

    private String titulo;
    private String autor;
    private int pagina;
    private double preco;

    Livros(String titulo, String autor, int pagina, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
        this.preco = preco;
    }

    void printarNaTela() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Pagina: " + pagina);
        System.out.println("Preco: " + preco);
    }

    boolean setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
            return true;
        } else {
            return false;
        }
    }

    /*public String toString() {
        return "Titulo: " + titulo
                + "\nAutor: " + autor
                + "\nPaginas: "
                + "\nPreco: " + preco;
    }*/
}
