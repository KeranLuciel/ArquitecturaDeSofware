package com.mycompany.sistemameca;

import java.util.List;

public class Pedido {
    
    private int numeropedido;
    private String fechapedido;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private Problema problema;
    private List<Pieza> piezasDeseadas;
    
    public Pedido(int numeropedido, String fechapedido, Cliente cliente, Vehiculo vehiculo, Problema problema, List<Pieza> piezasDeseadas) {
        this.numeropedido = numeropedido;
        this.fechapedido = fechapedido;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.problema = problema;
        this.piezasDeseadas = piezasDeseadas;
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
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public List<Pieza> getPiezasDeseadas() {
        return piezasDeseadas;
    }

    public void setPiezasDeseadas(List<Pieza> piezasDeseadas) {
        this.piezasDeseadas = piezasDeseadas;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("El pedido del cliente ").append(cliente.getNombre()).append(" de vehiculo ").append(vehiculo.getModelo())
            .append(" ").append(vehiculo.getMarca()).append(", quiere ").append(problema.getProblema())
            .append(" y se desea que se cambien las siguientes piezas: ");
        
        for (Pieza pieza : piezasDeseadas) {
            sb.append(pieza.getNombre()).append(", ");
        }
        
        // Eliminar la última coma y espacio
        if (!piezasDeseadas.isEmpty()) {
            sb.delete(sb.length() - 2, sb.length());
        }
        
        return sb.toString();
    }
}
