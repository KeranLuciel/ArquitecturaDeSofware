//
package com.mycompany.sistemameca;

import java.util.List;

public class Pedido {
    
    private int numeropedido;
    private String fechapedido;
    private Reparacion reparacion;
    private List<Pieza> piezasNecesarias;
    
    public Pedido(int numeropedido, String fechapedido, Reparacion reparacion, List<Pieza> piezasNecesarias) {
        this.numeropedido = numeropedido;
        this.fechapedido = fechapedido;
        this.reparacion = reparacion;
        this.piezasNecesarias = piezasNecesarias;
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
    
    public Reparacion getReparacion() {
        return reparacion;
    }

    public void setReparacion(Reparacion reparacion) {
        this.reparacion = reparacion;
    }
    
    public List<Pieza> getPiezasNecesarias() {
        return piezasNecesarias;
    }

    public void setPiezasNecesarias(List<Pieza> piezasNecesarias) {
        this.piezasNecesarias = piezasNecesarias;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El pedido número ").append(numeropedido)
            .append(" con fecha ").append(fechapedido)
            .append(" requiere la reparación: \n").append(reparacion.toString())
            .append(" y las siguientes piezas necesarias: ");
        
        return sb.toString();
    }
}

