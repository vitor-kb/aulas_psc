package aula_22_09;
import java.util.Scanner;
public class Smartphone {
    Scanner entrada = new Scanner(System.in);
    
    boolean estado = false;
    String marca;
    String modelo;
    boolean tamanhoTela;
    
    public void botao(){
        if(estado == false){
            System.out.println("Ligando...");
            estado = true;
        }else{
            System.out.println("Deseja desligar? s ou n");
            char opcao = entrada.next().charAt(0);
            if (opcao == 's'){
                System.out.println("Desligando...");
                estado = false;
            }
        }
        entrada.close();
    }
    
    public String toString(){
        return "Marca: " + marca + 
                "\nModelo: " + modelo + 
                "\nTamanho da Tela: " + tamanhoTela;
    }
}
