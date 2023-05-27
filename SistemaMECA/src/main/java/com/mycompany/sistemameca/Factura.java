package com.mycompany.sistemameca;

public class Factura {
    
    private int numerofactura;
    private String fecha;
    private Cliente cliente;
    private double monto;
    
    Factura(int numerofactura, String fecha, Cliente cliente, double monto, Contabilidad contabilidad){
        this.numerofactura = numerofactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.monto = monto;
        contabilidad.getFacturas().add(this);
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
    StringBuilder sb = new StringBuilder();
    sb.append("\nFactura:");
    sb.append(cliente.toString());
    sb.append("\n- Número de factura: ").append(numerofactura);
    sb.append("\n- Fecha: ").append(fecha);
    sb.append("\n- Monto: ").append(monto);
    return sb.toString();
}

}
