package com.mycompany.sistemameca;

public class Factura {
    
    private int numerofactura;
    private String fecha;
    private Cliente cliente;
    private double monto;
    
    public Factura(int numerofactura, String fechafactura, Cliente cliente){
        this.numerofactura = numerofactura;
        this.fecha = fecha;
        this.cliente = cliente;
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
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return """
               Factura: 
               - N\u00famero de factura: """ + numerofactura +
                "\n"+ cliente.toString()+
                "\n- Fecha: " + fecha +
                "\n- Monto: " + monto;
    }
}
