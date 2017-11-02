/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.LineasEspera;

import Auxiliares.Calculos;

/**
 *
 * @author chip_
 */
public class MM2 {
    private final Calculos calculos;
//    Velocidad de llegadas al sistema
    private double lamda;       
//    Velocidad de atencion del servidor
    private double miu;
//    Numero de Servidores
    private double servidores;
    
//    Constructor
    public MM2(double lamda, double miu, double servidores) {
        this.lamda = lamda;
        this.miu = miu;
        this.servidores = servidores;
        calculos = new Calculos();
    }

//    Getters and Setters
    public double getLamda() {
        return lamda;
    }

    public void setLamda(double lamda) {
        this.lamda = lamda;
    }

    public double getMiu() {
        return miu;
    }

    public void setMiu(double miu) {
        this.miu = miu;
    }

    public double getServidores() {
        return servidores;
    }

    public void setServidores(double servidores) {
        this.servidores = servidores;
    }
    
//    Metodos
    
//    Ls
    public double calcularPersonasSistema(){
        double ls = calcularPersonasCola() + (lamda / miu);
        return ls;
    }
    
//    Ws
    public double calcularTiempoEsperaSistema(){
        double ws = calcularTiempoEsperaCola() + (1 / miu);
        return ws;
    }
    
//    Lq
    public double calcularPersonasCola(){
        double lq = ((Math.pow((lamda / miu), servidores) * miu * lamda) / (calculos.calcularFactorial(servidores - 1) * (Math.pow((servidores * miu - lamda), 2)))) * calcularSistemaLibre();
        return lq;
    }
    
//    Wq
    public double calcularTiempoEsperaCola(){
        double wq = calcularPersonasCola() / lamda;
        return wq;
    }
    
//    P
    public double calcularUsoSistema(){
        double p = lamda / (servidores * miu);
        return p;
    }
    
//    Po
    public double calcularSistemaLibre(){
        double po = 1 / ((Math.pow((lamda / miu), 0) / calculos.calcularFactorial(0)) + ((Math.pow((lamda / miu), servidores) / calculos.calcularFactorial(servidores)) * ((servidores * miu) / (servidores * miu - lamda))));
        return po;
    }

//    Pn
    public double calcularClientesSistema(int n){
        double pn;
        if(n <= servidores){
            pn = (Math.pow((lamda / miu), n) / calculos.calcularFactorial(n)) * calcularSistemaLibre();
        } else {
            pn = (Math.pow((lamda / miu), n) / (calculos.calcularFactorial(servidores) * (Math.pow(servidores, (n - servidores))))) * calcularSistemaLibre();
        }
        return pn;
    }
}
