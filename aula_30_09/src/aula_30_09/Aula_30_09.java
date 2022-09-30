package aula_30_09;

public class Aula_30_09 {

    public static void main(String[] args) {
        Livros liv = new Livros(
                "Java for dummies",
                "Vitor",
                50,
                100.00);

        liv.printarNaTela();

        /*
        System.out.println(liv == liv2); // false <- não é o mesmo endereço de memória
        
        Livros liv3 = liv;
        System.out.println("Livro 1: " + liv);
        System.out.println("Livro 3: " + liv3);
        
        System.out.println(liv == liv3); // true <- mesmo endereço de memória
         */
    }

}
