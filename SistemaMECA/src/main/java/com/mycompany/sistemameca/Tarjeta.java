package com.mycompany.sistemameca;

import java.util.ArrayList;
import java.util.List;

public class Tarjeta {

    Cliente cliente;
    Vehiculo vehiculo;
    List<Problema> listaproblema;
    
    public Tarjeta(Cliente cliente, Vehiculo vehiculo, List<Problema> listaproblema){
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.listaproblema = listaproblema;
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
    
    @Override
    public String toString() {
//        return "\nTarjeta de Clientes-Servicio" + "\n" + cliente + "\n" + vehiculo + "\n" + listaproblema;
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

}
