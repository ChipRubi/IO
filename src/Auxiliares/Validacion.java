/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

/**
 *
 * @author chip_
 */
public class Validacion {
    
    public boolean esNumero(String numero){
        boolean resultado;
        try {
            Integer.parseInt(numero);
            resultado = true;
        } catch (NumberFormatException e) {
            resultado = false;
        }
        return resultado;
    }
    
}
