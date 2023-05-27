package com.mycompany.sistemameca;

public class Factura {
    
    private int numerofactura;
    private String fecha;
    private double monto;
    
    public Factura(int numerofactura, String fechafactura){
        this.numerofactura = numerofactura;
        this.fecha = fecha;
        this.monto = monto;
    }
    
    public int getNumerofactura(){
        return numerofactura;
    }
    
    public void setNumerofactura(int numerofactura){
        this.numerofactura = numerofactura;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFechafactura(String fecha){
        this.fecha = fecha;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public void setMonto(double monto){
        this.monto = monto;
    }
    
    @Override
    public String toString() {
        return """
               Factura: 
               - N\u00famero de factura: """ + numerofactura +
                "\n- Fecha: " + fecha +
                "\n- Monto: " + monto;
    }
}
