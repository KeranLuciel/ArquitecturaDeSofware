
package com.mycompany.sistemameca;

import java.util.List;

public class Tarjeta {
    
    Cliente cliente;
    Vehiculo vehiculo;
    List<Problema> listaproblema;
    
    public Tarjeta(){
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
    
    public Cliente crearTarjetaCliente(int codigo, String nombre, String apellidos, String direccion){
        
        Cliente nuevoCliente = new Cliente(codigo, nombre, apellidos, direccion);
        return nuevoCliente;
        
    }
    
}
