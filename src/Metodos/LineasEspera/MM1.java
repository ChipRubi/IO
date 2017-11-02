/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.LineasEspera;

/**
 *
 * @author chip_
 */
public class MM1 {
//    Velocidad de llegadas al sistema
    private double lamda;       
//    Velocidad de atencion del servidor
    private double miu;
    
//    Constructor
    public MM1(double lamda, double miu) {
        this.lamda = lamda;
        this.miu = miu;
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
    
//    Metodos
    
//    Ls
    public double calcularPersonasSistema(){
        double ls = lamda / (miu - lamda);
        return ls;
    }
    
//    Ws
    public double calcularTiempoEsperaSistema(){
        double ws = 1 / (miu - lamda);
        return ws;
    }
    
//    Lq
    public double calcularPersonasCola(){
        double lq = Math.pow(lamda, 2) / (miu * (miu - lamda));
        return lq;
    }
    
//    Wq
    public double calcularTiempoEsperaCola(){
        double wq = lamda / (miu * (miu - lamda));
        return wq;
    }
    
//    P
    public double calcularUsoSistema(){
        double p = lamda / miu;
        return p;
    }
    
//    Po
    public double calcularSistemaLibre(){
        double po = 1 - calcularUsoSistema();
        return po;
    }

//    Pn
    public double calcularClientesSistema(int n){
        double pn = (1 - (lamda / miu)) * Math.pow((lamda / miu), n);
        return pn;
    }
}
