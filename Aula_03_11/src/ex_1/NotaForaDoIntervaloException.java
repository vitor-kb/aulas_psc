package ex_1;

public class NotaForaDoIntervaloException extends Exception {

    @Override
    public String getMessage() {
        return "Nota fora do intervalo!";
    }
}
