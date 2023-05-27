package com.mycompany.sistemameca;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

    Cliente cliente;
    Vehiculo vehiculo;
    List<Problema> listaproblema;
    List<Pieza> piezasNecesarias;

    public Tarjeta(Cliente cliente, Vehiculo vehiculo, List<Problema> listaproblema, List<Pieza> piezasNecesarias){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.listaproblema = listaproblema;
        if (piezasNecesarias == null) {
            this.piezasNecesarias = new ArrayList<>();
        } else {
            this.piezasNecesarias = piezasNecesarias;
        }
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public List<Problema> getProblema(){
        return listaproblema;
    }
    
    public void setProblema(Problema problema){
        this.listaproblema = listaproblema;
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
        sb.append("\nTarjeta de Clientes-Servicio");
        sb.append("\n");
        sb.append(cliente.toString());
        sb.append("\n");
        sb.append(vehiculo.toString());
        sb.append("\n");
        for (Problema problema : listaproblema) {
            sb.append(problema.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public String toStringWithPiezas() {
        StringBuilder sb = new StringBuilder(toString());
        if (!piezasNecesarias.isEmpty()) {
            sb.append("\nTarjeta con piezas necesarias:\n");
            for (Pieza pieza : piezasNecesarias) {
                sb.append(pieza.toString());
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
