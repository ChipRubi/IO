/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.Grafico;

/**
 *
 * @author chip_
 */
public class Restricciones {
    
    private double[] x1;
    private double[] x2;
    private double[] solucion;

    public Restricciones(double[] x1, double[] x2, double[] solucion) {
        this.x1 = x1;
        this.x2 = x2;
        this.solucion = solucion;
    }

    public double[] getX1() {
        return x1;
    }

    public void setX1(double[] x1) {
        this.x1 = x1;
    }

    public double[] getX2() {
        return x2;
    }

    public void setX2(double[] x2) {
        this.x2 = x2;
    }

    public double[] getSolucion() {
        return solucion;
    }

    public void setSolucion(double[] solucion) {
        this.solucion = solucion;
    }
    
    public double[] obtenerPuntos(double x1, double x2, double sol){
        double var[] = new double[2];
//        Suponiendo que x2 sea 0
//        (var[0], 0)
        var[0] = sol / x1;
//        Suponiendo que x1 sea 0
//        (0, var[1])
        var[1] = sol / x2;    
        return var;
    }
    
    public double[] despejarEcuaciones(double e1[], double e2[]){
        double y = ((e2[2] * e1[0]) - (e2[0] * e1[2])) / ((e2[1] * e1[0]) - (e2[0] * e1[1]));
        double x = (e1[2] - (e1[1] * y)) / e1[0];
        double[] var = {x, y};
        return var;
    }
    
    
}
