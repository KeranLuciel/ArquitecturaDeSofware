package com.mycompany.sistemameca;

import java.util.List;

public class Contabilidad {

    private int ingresos;
    private int egresos;
    private int ganancias;
    private List<Factura> facturas;
    
    public Contabilidad(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    double calcularMontoTotal() {
        double montoTotal = 0.0;
        for (Factura factura : facturas) {
            montoTotal += factura.getMonto();
        }
        return montoTotal;
    }
    
    public String Contabilidades(int montoTotal){
        ingresos = montoTotal/4;
        egresos = montoTotal/2;
        ganancias = montoTotal/3;
        return 
                "\n Ingresos: "+ montoTotal/4 +
                "\n Egresos: " + montoTotal/2 +
                "\n Ganancias: " + montoTotal/3;
    }
    
//    public int getIngresos(){
//        return ingresos;
//    }
//    
//    public void setIngresos(int ingresos){
//        this.ingresos = ingresos;
//    }
//    
//    public int getEgresos(){
//        return egresos;
//    }
//    
//    public void setEgresos(int egresos){
//        this.egresos = egresos;
//    }
//    
//    public int getGanancias(){
//        return ganancias;
//    }
//    
//    public void setGanancias(int ganancias){
//        this.ganancias = ganancias;
//    }
    
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
