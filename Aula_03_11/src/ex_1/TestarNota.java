package ex_1;

public class TestarNota {

    public static void testarNota(double n1, double n2) throws NotaForaDoIntervaloException {
        if (n1 >= 0 && n1 <= 10 && n2 >= 0 && n2 <= 10) {
            
        }else{
            throw new NotaForaDoIntervaloException();
        }
    }
}
