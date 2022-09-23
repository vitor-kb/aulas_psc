package aula_22_09;
public class ExibeMes {
    public void exibirMes(int n){

        if (n == 1){
            System.out.println("Janeiro");
        }
        if (n == 2){
            System.out.println("Fevereiro");
        }
        if (n == 3){
            System.out.println("Marco");
        }
        if (n == 4){
            System.out.println("Abril");
        }
        if (n == 5){
            System.out.println("Maio");
        }
        if (n == 6){
            System.out.println("Junho");
        }
        if (n == 7){
            System.out.println("Julho");
        }
        if (n == 8){
            System.out.println("Agosto");
        }
        if (n == 9){
            System.out.println("Setembro");
        }
        if (n == 10){
            System.out.println("Outubro");
        }
        if (n == 11){
            System.out.println("Novembro");
        }
        if (n == 12){
            System.out.println("Dezembro");
        }
        if(n < 1 || n > 12){
            System.out.println("Número inválido, digite apenas números entre 1 e 12");
        }
    }
}
