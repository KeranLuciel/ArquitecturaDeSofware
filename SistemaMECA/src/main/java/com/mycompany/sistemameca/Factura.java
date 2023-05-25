
package com.mycompany.sistemameca;

public class Factura {
    
    private int numerofactura;
    private String fechafactura;
    
    public Factura(int numerofactura, String fechafactura){
        this.numerofactura = numerofactura;
        this.fechafactura = fechafactura;
    }
    
    public int getNumerofactura(){
        return numerofactura;
    }
    
    public void setNumerofactura(int numerofactura){
        this.numerofactura = numerofactura;
    }
    
    public String getFechafactura(){
        return fechafactura;
    }
    
    public void setFechafactura(String fechafactura){
        this.fechafactura = fechafactura;
    }
}
