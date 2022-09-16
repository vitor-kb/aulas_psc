package vetores_matriz;
import java.util.Scanner;
public class Vetores_matriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //linha, coluna
        //EX 1 / 2
        /*int matriz[][] = new int[2][2];
        
        int acu0= 0, acu1= 0;
        
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                System.out.println("Digite um número");
                matriz[linha][coluna] = entrada.nextInt();
            }
        }
        /*for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                System.out.println("Linha: " + (linha+1) + ", Coluna: " + (coluna+1) + " : " + matriz[linha][coluna]);
            }
        }*/
        
        /*for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println("");
        }*/
        /*for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                // \t da um espaço maior, como se fosse o TAB do teclado
                System.out.printf("\t %d",matriz[linha][coluna]);
            }
            System.out.println("");
        }*/
        /*for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                // \t da um espaço maior, como se fosse o TAB do teclado
                System.out.printf("\t %d",matriz[linha][coluna]);
                if (linha == 0){
                    acu0=acu0 + matriz[linha][coluna];
                }else acu1=acu1 + matriz[linha][coluna];
            }
            System.out.println("\n");
        }
        System.out.println("A somatoria da linha 1: "+acu0);
        System.out.println("A somatoria da linha 2: "+acu1);
        System.out.println("A somatoria da matriz e: "+(acu0+acu1));
        */
        //EX 3
        /*String matriz[][] = new String[3][1];
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 1; coluna++){
                System.out.println("Digite uma palavra: ");
                matriz[linha][coluna] = entrada.nextLine();
            }
        }
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 1; coluna++){
                for(int j = matriz[linha][coluna].length()-1; j >= 0; j--){
                    System.out.printf("%c", matriz[linha][coluna].charAt(j));
                }
                System.out.println("");
            }
        }*/
        //EX 4
        int matriz[][] = new int[3][3];
        
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                System.out.println("Digite um número");
                matriz[linha][coluna] = entrada.nextInt();
            } 
        }
        for(int linha = 0; linha < 2; linha++){
            for(int coluna = 0; coluna < 2; coluna++){
                for(int j = 0; j <= matriz[linha][coluna]; j++){
                    System.out.println(matriz[linha][coluna]*5);
                }
            } 
        }
        
        entrada.close();
    }
    
}
