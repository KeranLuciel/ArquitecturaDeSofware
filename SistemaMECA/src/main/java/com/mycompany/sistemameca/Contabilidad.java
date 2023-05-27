package com.mycompany.sistemameca;

import java.util.List;

public class Contabilidad {

    private int ingresos;
    private int egresos;
    private int ganancias;
    private List<Factura> facturas;

    public Contabilidad(int ingresos, int egresos, int ganancias, List<Factura> facturas) {
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.ganancias = ganancias;
        this.facturas = facturas;
    }
    public int getIngresos(){
        return ingresos;
    }
    
    public void setIngresos(int ingresos){
        this.ingresos = ingresos;
    }
    
    public int getEgresos(){
        return egresos;
    }
    
    public void setEgresos(int egresos){
        this.egresos = egresos;
    }
    
    public int getGanancias(){
        return ganancias;
    }
    
    public void setGanancias(int ganancias){
        this.ganancias = ganancias;
    }
    
    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
