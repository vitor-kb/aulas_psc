package aula_22_09;
public class Lampada {
    //atributos
    double preco;
    String cor;
    int voltagem;
    String marca;
    
    boolean estado = false;
    
    //comportamentos
    public void acender(){
        estado = true;
        System.out.println("Ligada!");
    }
    public void apagar(){
        if (estado == true){
            System.out.println("Desligada!");
        }else System.out.println("A lâmpada ja está apagada!");
    }
    
    public String toString(){
        return "Preço: " + preco + 
                "\nCor: " + cor + 
                "\nVoltagem: " + voltagem + "W" + 
                "\nMarca: " + marca;
    }
}
