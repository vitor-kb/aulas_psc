package aula_29_09;
public class RoboSimples {
    
    private char direcao;
    
    public void setDirecao(char direcao){
        this.direcao = direcao;
    }
    
    public void testar(){
        switch (this.direcao){
            case 'N': System.out.println("Norte");break;
            case 'S': System.out.println("Sul");break;
            case 'L': System.out.println("Leste");break;
            case 'O': System.out.println("Oeste");break;
            default:{
                System.out.println("Direcao invalida");
                System.out.println("Direcao Norte");
            }break;
        }
    }
}
