package lista_exs_joao_09_09;
import java.util.Scanner;
public class Lista_exs_joao_09_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //EX 1
        /*double salario = 100.00;
        double salario_2 = 200.00;
        double salario_3 = 300.00;
        double ir = 0.00;
        double ir_2 = 10.00;
        double ir_3 = 15.00;
        double salliq = 100.00;
        double salliq_2 = 190.00;
        double salliq_3 = 285.00;

        if (salliq >= 100){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if (salliq_2 < 190){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if (salliq_3 == salario + ir_3){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/
        
        //EX 2
        /*int a = 3;
        int b = 7;
        int c = 4;
        
        if((a+c) > b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if(b >= (a + 2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if(c == (b - a)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if((b + a) <= c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if((c + a) > b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/
        
        //EX 3
        /*int a = 5;
        int b = 4;
        int c = 3;
        int d = 6;
        
        if(a > c && c <= d){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if(a + b > 10 || (a + b) == (c+ +d)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        if( a >= c && d >= c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }*/
        
        //EX 4
        /*int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("Número Par");
        }else{
            System.out.println("Número Ímpar");
        }
        if (numero > 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }*/
        
        //EX 5
        /*double altura;
        String sexo;

        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();
        
        double peso_ideal_f = ((62.1 * altura) - 44.7);
        double peso_ideal_m = ((72.7 * altura) - 58);
        
        System.out.println("Digite seu sexo(masculino ou feminino): ");
        sexo = entrada.next();
        
        if("masculino".equals(sexo)){
            System.out.println("Seu peso ideal: " + (float)peso_ideal_m);
        }
        
        if("feminino".equals(sexo)){
            System.out.println("Seu peso ideal: " + (float)peso_ideal_f);
        }*/
        entrada.close();
    } 
}
