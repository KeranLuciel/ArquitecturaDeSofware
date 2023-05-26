package com.mycompany.sistemameca;

public class Pedido {
    
    private int numeropedido;
    private String fechapedido;
    
    public Pedido(int numeropedido, String fechapedido){
        this.numeropedido = numeropedido;
        this.fechapedido = fechapedido;
    }
    
    public int getNumeropedido(){
        return numeropedido;
    }
    
    public void setNumeropedido(int numeropedido){
        this.numeropedido = numeropedido;
    }
    
    public String getFechaPedido(){
        return fechapedido;
    }
    
    public void setFechaPedido(String fechapedido){
        this.fechapedido = fechapedido;
    }
}
