package teste_ex03_ren;

public class EmptyFieldException extends Exception {
    @Override
    public String getMessage(){
        return "Campos vazios!";
    }
}
