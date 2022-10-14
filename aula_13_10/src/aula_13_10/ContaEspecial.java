package aula_13_10;

public class ContaEspecial extends ContaCorrente {

    @Override

    public void sacar(double valor) {
        double taxa = valor * 1.001;
        if (taxa <= super.getSaldo()) {
            super.setSaldo(super.getSaldo() - taxa);
            System.out.println("Saque efetuado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
