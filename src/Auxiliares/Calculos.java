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
public class Calculos {
    
    public double calcularFactorial(double numero){
        double resultado;
        if(numero == 0){
            return 1;
        } else {
            return numero * calcularFactorial(numero - 1);
        }
    }
    
}
