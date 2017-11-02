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
public class ConProduccion {
    
    private double demanda;
    private double demandaMinima;
    private double produccion;
    private double costoPedido;
    private double costoAlmacenamiento;

    public ConProduccion(double demanda, double demandaMinima, double produccion, double costoPedido, double costoAlmacenamiento) {
        this.demanda = demanda;
        this.demandaMinima = demandaMinima;
        this.produccion = produccion;
        this.costoPedido = costoPedido;
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    public ConProduccion(double demanda, double produccion, double costoPedido, double costoAlmacenamiento) {
        this.demanda = demanda;
        this.demandaMinima = demanda;
        this.produccion = produccion;
        this.costoPedido = costoPedido;
        this.costoAlmacenamiento = costoAlmacenamiento;
    }

    public double getDemanda() {
        return demanda;
    }

    public void setDemanda(double demanda) {
        this.demanda = demanda;
    }

    public double getDemandaMinima() {
        return demandaMinima;
    }

    public void setDemandaMinima(double demandaMinima) {
        this.demandaMinima = demandaMinima;
    }

    public double getProduccion() {
        return produccion;
    }

    public void setProduccion(double produccion) {
        this.produccion = produccion;
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
    
//    Metodos
    
//    CT
    public double calcularCostoTotal(){
        double ct = (costoPedido * (demanda / calcularUnidadesPedido())) + (costoAlmacenamiento * ((calcularUnidadesPedido() * (produccion - demandaMinima)) / (2 * produccion)));
        return ct;
    }
    
//    Q
    public double calcularUnidadesPedido(){
        double q = Math.sqrt((2 * produccion * costoPedido * demanda) / (costoAlmacenamiento * (produccion - demandaMinima)));
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
