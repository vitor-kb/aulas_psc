package aula_06_10;

import java.util.Scanner;

public class Relogio {

    //atributos
    private int hora,
            minutos,
            segundos;

    //metodos acessores
    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minutos) {
        this.minutos = minutos;
    }

    public int getMinuto() {
        return this.minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return this.segundos;
    }

    //construtores
    public Relogio(char opcao) {

    }

    public Relogio() {
        this.hora = 12;
        this.minutos = 00;
        this.segundos = 00;
        System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
    }

    //polimorfismo
    public Relogio(int hora) {
        this.hora = hora;
        this.minutos = 00;
        this.segundos = 00;
        System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
    }

    //polimorfismo
    public Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minutos = minuto;
        this.segundos = 00;
        System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minutos = minuto;
        this.segundos = segundo;
        System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
    }

    //comportamento
    Scanner entrada = new Scanner(System.in);

    public void acertaHora() {
        System.out.print("Digite a hora: ");
        this.hora = entrada.nextInt();
        System.out.print("Digite o minuto: ");
        this.minutos = entrada.nextInt();
        System.out.print("Digite o segundo: ");
        this.segundos = entrada.nextInt();

        System.out.println(this.hora + ":" + this.minutos + ":" + this.segundos);
        entrada.close();
    }
}
