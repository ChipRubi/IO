/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos.Inventario;

/**
 *
 * @author chip_
 */
public class ConFaltante {
    
    private double demanda;
    private double costoUnitario;
    private double costoPedido;
    private double costoAlmacenamiento;
    private double costoFaltante;

    public ConFaltante(double demanda, double costoUnitario, double costoPedido, double costoAlmacenamiento, double costoFaltante) {
        this.demanda = demanda;
        this.costoUnitario = costoUnitario;
        this.costoPedido = costoPedido;
        this.costoAlmacenamiento = costoAlmacenamiento;
        this.costoFaltante = costoFaltante;
    }

    public double getDemanda() {
        return demanda;
    }

    public void setDemanda(double demanda) {
        this.demanda = demanda;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getCostoPedido() {
        return costoPedido;
    }

    public void setCostoPedido(double costoPedido) {
        this.costoPedido = costoPedido;
    }

    public double getCostoAlmacenamiento() {
        return costoAlmacenamiento;
    }

    public void setCostoAlmacenamiento(double costoAlmacenamiento) {
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    public double getCostoFaltante() {
        return costoFaltante;
    }

    public void setCostoFaltante(double costoFaltante) {
        this.costoFaltante = costoFaltante;
    }
    
//    Metodos
    
//    CT
    public double calcularCostoTotal(){
        double ct = (costoUnitario * calcularUnidadesPedido()) + (costoPedido) + (calcularTiempoPedidos() * (calcularInventarioMaximo() / 2) * costoAlmacenamiento) + (((calcularTiempoFaltante() * calcularUnidadesFaltantes()) / 2) * costoFaltante);
        return ct;
    }
    
//    Q
    public double calcularUnidadesPedido(){
        double q = Math.sqrt((2 * demanda * costoPedido * (costoFaltante + costoAlmacenamiento)) / (costoFaltante * costoAlmacenamiento));
        return q;
    }
    
//    S
    public double calcularUnidadesFaltantes(){
        double s = Math.sqrt((2 * demanda * costoPedido * costoAlmacenamiento) / (costoFaltante * (costoFaltante + costoAlmacenamiento)));
        return s;
    }
    
//    T1
    public double calcularTiempoPedidos(){
        double t1 = (calcularUnidadesPedido() - calcularUnidadesFaltantes()) / demanda;
        return t1;
    }
    
//    T2
    public double calcularTiempoFaltante(){
        double t2 = calcularUnidadesFaltantes() / demanda;
        return t2;
    }
    
//    Imax
    public double calcularInventarioMaximo(){
        double imax = calcularUnidadesPedido() - calcularUnidadesFaltantes();
        return imax;
    }
    
//    N
    public double calcularNumeroPedidos(){
        double n = demanda / calcularUnidadesPedido();
        return n;
    }
    
}
