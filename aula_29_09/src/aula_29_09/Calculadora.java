package aula_29_09;
public class Calculadora {
    double num1, num2;
    
    public double operacao (double num1, double num2){
        return num1 + num2;
    }
    
    public double operacao (int num1, double num2){
        return num1 - num2;
    }
    
    public double operacao (double num1, int num2){
        return num1 * num2;
    }
    
    public double operacao (int num1, int num2){
        return num1 / num2;
    }
    
    public double operacao (int num1, short num2){
        return num1 % num2;
    }
}
