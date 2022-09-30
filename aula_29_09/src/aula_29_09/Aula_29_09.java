package aula_29_09;
public class Aula_29_09 {
    public static void main(String[] args) {
        /*ContaBancaria cc = new ContaBancaria();
        
        cc.deposita(1000);
        cc.setNome("Vitor");
        cc.sacar(10);*/
        
        /*RoboSimples robs = new RoboSimples();
        
        robs.setDirecao('N');
        robs.testar();*/
        
        //Calculadora calc = new Calculadora();
        
        //System.out.println("Op: " + calc.operacao(5, 2));
        
        //OPCIONAL
        /*System.out.println("Op1: " + calc.operacao1(1.0, 2.5));
        System.out.println("Op2: " + calc.operacao2(1, 2.5));
        System.out.println("Op3: " + calc.operacao3(2.5, 1));
        System.out.println("Op4: " + calc.operacao4(5, 2));
        System.out.println("Op5: " + calc.operacao5(5, (short)(2)));*/
        
        Funcionario func = new Funcionario();
        Gerente geren = new Gerente();
        
        func.setNome("Vitor");
        func.setCargo("Professor");
        func.setSalario(1000);
        System.out.println(func.toString());
        geren.atualizar(func, 500);
        System.out.println(func.toString());
        geren.atualizar(func, "Vendedor");
        System.out.println(func.toString());
    }
}
