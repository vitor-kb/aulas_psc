/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_ex03_ren;

/**
 *
 * @author 12522145641
 */
public class WrongLoginException extends Exception{
    @Override
    public String getMessage(){
        return "Nome de usuario ou senha invalidos!";
    }
}
