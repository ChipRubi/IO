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
public class SinFaltante {
    
    private double demanda;
    private double costoPedido;
    private double costoUnitario;
    private double costoMantenimiento;

    public SinFaltante(double demanda, double costoPedido, double costoUnitario, double costoMantenimiento) {
        this.demanda = demanda;
        this.costoPedido = costoPedido;
        this.costoUnitario = costoUnitario;
        this.costoMantenimiento = costoMantenimiento;
    }

    public double getDemanda() {
        return demanda;
    }

    public void setDemanda(double demanda) {
        this.demanda = demanda;
    }

    public double getCostoPedido() {
        return costoPedido;
    }

    public void setCostoPedido(double costoPedido) {
        this.costoPedido = costoPedido;
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        this.costoMantenimiento = costoMantenimiento;
    }
    
//    Metodos
    
//    CT    
    public double calcularCostoTotal(){
        double ct = (demanda * costoUnitario) + ((demanda / calcularUnidadesPedido()) * costoPedido) + ((calcularUnidadesPedido() / 2) * costoMantenimiento);
        return ct;
    }
    
//    Q
    public double calcularUnidadesPedido(){
        double q = Math.sqrt((2 * demanda * costoPedido) / costoMantenimiento);
        return q;
    }
    
//    N
    public double calcularNumeroPedidos(){
        double n = demanda / calcularUnidadesPedido();
        return n;
    }
    
//    T
    public double calcularTiempoPedidos(){
        double t = calcularUnidadesPedido() / demanda;
        return t;
    }
}
